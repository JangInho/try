package ballsona.sona.repository;

import ballsona.sona.domain.Story;

import java.util.List;

public interface ListRepository {

    void save(Story story);

    List<String> show();

}
