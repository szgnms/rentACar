package com.dev3.rentACar.business.abstracts;

import com.dev3.rentACar.business.requests.CreateBrandRequest;
import com.dev3.rentACar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
