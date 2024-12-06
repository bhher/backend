package a1206.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public UserRepository(){
         // 더미 데이터 추가
         users.add(new User(1L, "Alice"));
         users.add(new User(2L, "Bob"));
         users.add(new User(3L, "Charlie"));
    }

    public Optional<User> findById(long id) {
        // for(User user : users){ //user 리스트를 하나씩 반복
        //     if(user.getId().equals(id)){ //존건에 맞는 user 를 찾으면
        //         return Optional.of(user); //Optional 에 담아 반환
        //     }
        // }
        // return Optional.empty(); // 없으면 빈 Optional
        return users.stream()
            .filter(user->user.getId().equals(id))
            .findFirst();
         
    
    }




    
}
