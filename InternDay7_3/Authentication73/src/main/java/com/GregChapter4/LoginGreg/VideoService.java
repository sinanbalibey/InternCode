package com.GregChapter4.LoginGreg;

import jakarta.annotation.PostConstruct;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class VideoService {

    private final VideoRepository repository;

    public VideoService(VideoRepository repository) {
        this.repository = repository;
    }

    public List<VideoEntity> getVideos() {
        return repository.findAll();
    }

    public VideoEntity create(NewVideo newVideo, String username) {
        return repository.saveAndFlush(new VideoEntity(username, newVideo.name(), newVideo.description()));
    }

    public List<VideoEntity> search(Search search) {
        VideoEntity probe = new VideoEntity();
        if (StringUtils.hasText(search.value())) {
            probe.setName(search.value());
            probe.setDescription(search.value());
        }
        Example<VideoEntity> example = Example.of(probe, //
                ExampleMatcher.matchingAny() //
                        .withIgnoreCase() //
                        .withStringMatcher(StringMatcher.CONTAINING));
        return repository.findAll(example);
    }

    public void delete(Long videoId) {
        repository.findById(videoId) //
                .map(videoEntity -> {
                    repository.delete(videoEntity);
                    return true;
                }) //
                .orElseThrow(() -> new RuntimeException("No video at " + videoId));
    }

    @PostConstruct
    void initDatabase() {
        repository.save(new VideoEntity("alice", "Need HELP with your SPRING BOOT 3 App?",
                "SPRING BOOT 3 yalnızca işleri hızlandıracak ve şablonları ve ham verileri sunmayı süper BASİT hale getirecektir."));
        repository.save(new VideoEntity("alice", "Don't do THIS to your own CODE!",
                "Profesyonel bir geliştirici olarak, bunu asla kodunuza ASLA yapmayın. Çünkü eninde sonunda bunu KENDİNİZE yapacaksınız!"));
        repository.save(new VideoEntity("bob", "SECRETS to fix BROKEN CODE!",
                "Yalnızca kodunuzdaki hataları ayıklamanın değil, aynı zamanda güveninizi yeniden kazanmanın ve bir yazılım geliştiricisi olarak oyuna geri dönmenin yollarını keşfedin."));
    }
}
