package ballsona.sona.repository;


import ballsona.sona.domain.Story;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryListRepository implements ListRepository {

    List<Story> store = new ArrayList<>();

    @Override
    public void save(Story story) {
        store.add(story);
    }

    @Override
    public List<String> show() {
        List<String> titles = new ArrayList<>();

        for(Story s : store){
            titles.add(s.getTitle());
        }

        return titles;

    }

}
