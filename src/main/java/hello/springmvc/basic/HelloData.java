package hello.springmvc.basic;

import lombok.Data;

@Data //게터 세터 tostring 등등 포함됨.
public class HelloData {
    private String username;
    private int age;
}
