package org.ocean.freeapiservice.constants;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;
import java.util.List;


@ApplicationScope
@Component
@Data
public class SomeData {
    ArrayList<String> data = new ArrayList<>(List.of("apple", "banana", "custard apple", "dragan fruit", "Ice create", "respberry"));

}
