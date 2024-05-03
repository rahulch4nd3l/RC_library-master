package com.rahul.library.repository;

import com.rahul.library.entity.ReadingList;
import com.rahul.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<ReadingList, Integer> {

    List<ReadingList> findReadingListByUser(User user);

    ReadingList findReadingListByUser_IdAndBook_Id(int userId, int bookId);

    void deleteReadingListByUser_IdAndBook_Id(int userId, int bookId);

}
