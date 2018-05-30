package com.gradles.demo.serviceImpl;

import com.gradles.demo.dao.BookDao;
import com.gradles.demo.pojo.Book;
import com.gradles.demo.service.BookServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookServie {

        private BookDao bookDao;

        @Autowired
        public BookServiceImpl(BookDao bookDao){
             this.bookDao=bookDao;
        }
    @Override
    public Boolean save(Book record){
            Book  b=  bookDao.save(record);
            if(b.getName()!=null&&b.getName().length()>0){
                return Boolean.TRUE;
            }else{
                return Boolean.FALSE;
            }
    }
}
