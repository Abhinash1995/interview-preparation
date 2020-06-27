package com.company.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

//    public List<School> getSchoolwithIds(List<Long> ids){
//        return ids.stream().map(x->schoolRepositary.findStudentById(x)).collect(Collectors.toList());
//    }



    public static int multiply(int num){
        return num*num;
    }


    public static int add(int num){
        return num+num;
    }

    //We have Three intermediate method
//    1. Map        Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
//    2. filter     names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//    3. sorted     number.stream().sorted().collect(Collectors.toList());
//    4. distinct   List<Integer> newList = number.stream().distinct().collect(Collectors.toList());
//
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(5,6,2,3,4,5,1);
        number.forEach(System.out::println);

        System.out.println("----------------------------");

//        Converting list in to stream
       Stream<Integer> integerStream = number.stream();
        Stream<Object> square = integerStream.map(x ->multiply(x));
        square.forEach(System.out::println);

        System.out.println("----------------------------");
        List<Integer> show =
                number.stream().sorted().collect(Collectors.toList());
        System.out.println(show);


        System.out.println("----------------------------");
        List<String> names = Arrays.asList("Reflection","Collection","Stream","Soap");
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        System.out.println("----------------------------");
        List<Integer> numbers = Arrays.asList(2,3,4,5,2,4);
        int even =
                numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);


    }

          //    FlatMap Use


//public List<String> distinctLanguage(){
//    List<String[]> languagesList =  projectRepos.getLanguagesList();
//    return languagesList.stream().flatMap(Stream::of).distinct().collect(Collectors.toList());
//}

//    List<Object> flat = objArrs.stream()
//            .flatMap(Stream::of)
//            .collect(Collectors.toList());


//    List<Object[]> list = ...
//    List<Object> l = list.stream()
//            .flatMap(arr -> Stream.of(arr))
//            .collect(Collectors.toList());


//    List<WritersProjectMappModel> mappModels = writerPrjMapRepos.getProjectIdsByProjectStatus(projectStatus);

//        List<Long> ids = mappingList.stream().filter(x-> x.getProjectStatus().equals(userId))
//                .map(WriterProjectMapping::getProjectId).collect(Collectors.toList());
//       List<WriterProjectMapping> mappingList2 =  mappingList.stream().filter(x-> x.getProjectStatus().equals(userId)).collect(Collectors.toList());
}
