package com.jp.frank.service;

import com.jp.frank.model.AccountDetails;
import com.jp.frank.model.AccountInfo;

import java.util.List;

public interface ValidateService {


    List<AccountDetails> getAccountDetails(AccountInfo accountInfo);
}
