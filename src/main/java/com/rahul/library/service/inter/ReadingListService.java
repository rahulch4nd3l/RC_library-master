package com.rahul.library.service.inter;

import com.rahul.library.entity.ReadingList;
import com.rahul.library.entity.User;

import java.util.List;

public interface ReadingListService {

    List<ReadingList> findReadingListByUser(User user);

    ReadingList findReadingListByUserIdAndBookId(int userId, int bookId);

    ReadingList save(ReadingList readingList);

    void deleteReadingListByUserIdAndBookId(int userId, int bookId);

}
