package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WMSApplication {

    public static void main(String[] args) {

        SpringApplication.run(WMSApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  若依启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "                               `\n" +
                "         ;@@$|!;::;!|$@@:      `\n" +
                "          '!'        :|.       `\n" +
                "           :!.      :!.        `\n" +
                "            ;:     .!:         `\n" +
                "            ;;     `!`         `\n" +
                "           !;       .!'        `\n" +
                "         ;!           .|;      `\n" +
                "       '%:              ;%'    `\n" +
                "     :%' .|;              '%:  `\n" +
                "    ;!  `!'                 !! `\n" +
                "    :! '!`                  !; `\n" +
                "    .!:.!'                 `!` `\n" +
                "      ;!  :;              ;!   `\n" +
                "       !!                :!.   `\n" +
                "        !!              :!.    `\n" +
                "         !%:.         .;|`     `\n" +
                "              .`':'`           `");
    }
}