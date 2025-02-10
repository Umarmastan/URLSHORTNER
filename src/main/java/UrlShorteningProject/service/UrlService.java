package UrlShorteningProject.service;

import UrlShorteningProject.model.Url;
import UrlShorteningProject.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService
{
    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public  void  deleteShortLink(Url url);
}
