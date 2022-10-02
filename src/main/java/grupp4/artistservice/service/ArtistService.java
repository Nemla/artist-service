package grupp4.artistservice.service;


import grupp4.artistservice.model.Artist;
import grupp4.artistservice.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public Artist saveArtist(Artist artist){
        System.out.println("testar artist service saveartist");
        return artistRepository.save(artist);
    }

    public Artist findById(int artistId){
        System.out.println("test i artistservice findbyid");
        return artistRepository.findById(artistId);
    }



}
