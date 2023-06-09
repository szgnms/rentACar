package com.dev3.rentACar.business.concrets;

import com.dev3.rentACar.business.abstracts.BrandService;
import com.dev3.rentACar.business.requests.CreateBrandRequest;
import com.dev3.rentACar.business.responses.GetAllBrandsResponse;
import com.dev3.rentACar.dataAccess.abstracts.BrandRepository;
import com.dev3.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service//Bu sinif bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {

    private BrandRepository brandRepository;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandsResponse>brandsResponse=new ArrayList<>();
        for (Brand brand : brands) {
            GetAllBrandsResponse response=new GetAllBrandsResponse();
            response.setId(brand.getId());
            response.setName(brand.getName());
            brandsResponse.add(response);
        }



        //is kurallari
        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand=new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
