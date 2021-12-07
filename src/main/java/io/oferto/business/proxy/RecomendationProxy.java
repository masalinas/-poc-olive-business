package io.oferto.business.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.oferto.business.config.ProxyConfig;
import io.oferto.business.domain.Recomendation;

@FeignClient(name = "recomendation-service", url = "${microservice.recomendation.url}", configuration = {ProxyConfig.class})
public interface RecomendationProxy {
	@RequestMapping(value = "/api/recomendations/{code}", method = RequestMethod.GET)	
	public List<Recomendation> getRecomendationsByProduct(@PathVariable("code") String code);
	
	@RequestMapping(value = "/api/recomendations/{code}", method = RequestMethod.POST)	
	public Recomendation addRecomendation(@PathVariable("code") String code, @RequestBody String message);
}
