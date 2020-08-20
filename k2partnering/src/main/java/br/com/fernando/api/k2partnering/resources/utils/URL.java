package br.com.fernando.api.k2partnering.resources.utils;

import java.net.URLDecoder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {

    public static String decodeParam(String s) {
        return URLDecoder.decode(s, StandardCharsets.UTF_8);
    }

    public static List<Integer> decodeIntList(String s) {
        return Arrays.stream(s.split(",")).map(Integer::parseInt).collect(Collectors.toList());
    }
    // public static List<Integer> decodeIntList(String s) {
    //   String[] vet = s.split(",");
    // List<Integer> list = new ArrayList<>();
    // for (int i=0; i<vet.length; i++) {
    //    list.add(Integer.parseInt(vet[i]));
    // }
    // return list;
    //}
}