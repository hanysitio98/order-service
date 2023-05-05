package id.co.bca.miniproject.orderservice.service;

import id.co.bca.miniproject.orderservice.model.Product;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebclientService {

    private RestTemplate restTemplate;

    public WebclientService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    String productUrl = "http://localhost:8081";

    public Product getProductData(Integer id) {
        ResponseEntity<Product> response = restTemplate.exchange(productUrl + "/product/product?id={id}", HttpMethod.GET, null, Product.class, id);
        return response.getBody();
    }
}
