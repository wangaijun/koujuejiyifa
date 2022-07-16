package com.company;

/**
 * @author wanga
 * @date 2022/7/17
 * @description
 */
public class Strategy {

    static StringBuilder generateKouJue(String[] strings) {
        String tmp = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i< strings[0].length(); i++){
            tmp = tmp + strings[0].charAt(i);
            for (int j = 0; j< strings[1].length(); j++) {
                tmp = tmp + strings[1].charAt(j);
                for (int k = 0; k< strings[2].length(); k++){
                    tmp = tmp + strings[2].charAt(k);
                    for (int l = 0; l< strings[3].length(); l++){
                        tmp = tmp + strings[3].charAt(l);
                        for (int m = 0; m< strings[4].length(); m++){
                            tmp = tmp + strings[4].charAt(m);
                            for (int n = 0; n< strings[5].length(); n++){
                                tmp = tmp + strings[5].charAt(n);
                                for (int o = 0; o< strings[6].length(); o++){
                                    tmp = tmp + strings[6].charAt(o);
                                    for (int p = 0; p< strings[7].length(); p++){
                                        tmp = tmp + strings[7].charAt(p);
                                        for (int q = 0; q< strings[8].length(); q++){
                                            tmp = tmp + strings[8].charAt(q);
                                            for (int r = 0; r < strings[9].length(); r++) {
                                                tmp = tmp + strings[9].charAt(r);
                                                System.out.println(tmp);
                                                stringBuilder.append(tmp+"\n");
                                                tmp = tmp.substring(0,tmp.length()-1);
                                            }
                                            tmp = tmp.substring(0,tmp.length()-1);
                                        }
                                        tmp = tmp.substring(0,tmp.length()-1);
                                    }
                                    tmp = tmp.substring(0,tmp.length()-1);
                                }
                                tmp = tmp.substring(0,tmp.length()-1);
                            }
                            tmp = tmp.substring(0,tmp.length()-1);
                        }
                        tmp = tmp.substring(0,tmp.length()-1);
                    }
                    tmp = tmp.substring(0,tmp.length()-1);
                }
                tmp = tmp.substring(0,tmp.length()-1);
            }
            tmp = tmp.substring(0,tmp.length()-1);
        }
        return stringBuilder;
    }
}
