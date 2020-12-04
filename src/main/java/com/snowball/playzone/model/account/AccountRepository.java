package com.snowball.playzone.model.account;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Repository;

import com.snowball.playzone.model.BaseRepository;

@Repository
public interface AccountRepository extends BaseRepository<Account,Id> {

	Account findByUsername(String username);
}
