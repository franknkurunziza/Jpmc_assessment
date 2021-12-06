package com.jp.frank.service;

import com.jp.frank.model.ProviderRequest;

public interface ProviderService {

    boolean isProvider1Valid(ProviderRequest request);

    boolean isProvider2Valid(ProviderRequest request);
}
