package judge.remote.shared.codeforces;

import java.util.HashMap;
import java.util.LinkedHashMap;

import judge.remote.language.LanguageFinder;
import judge.tool.Handler;

import org.springframework.stereotype.Component;

@Component
public abstract class CFStyleLanguageFinder implements LanguageFinder {

    @Override
    public boolean isDiverse() {
        return true;
    }

    @Override
    public void getLanguages(String remoteProblemId, Handler<LinkedHashMap<String, String>> handler) {
        // TODO Auto-generated method stub
    }

    @Override
    public LinkedHashMap<String, String> getDefaultLanguages() {
        LinkedHashMap<String, String> languageList = new LinkedHashMap<>();
        languageList.put("43","GNU GCC C11 5.1.0");
        languageList.put("80","Clang++20 Diagnostics");
        languageList.put("52","Clang++17 Diagnostics");
        languageList.put("50","GNU G++14 6.4.0");
        languageList.put("54","GNU G++17 7.3.0");
        languageList.put("73","GNU G++20 11.2.0 (64 bit, winlibs)");
        languageList.put("59","Microsoft Visual C++ 2017");
        languageList.put("61","GNU G++17 9.2.0 (64 bit, msys 2)");
        languageList.put("65","C# 8, .NET Core 3.1");
        languageList.put("79","C# 10, .NET SDK 6.0");
        languageList.put("9", "C# Mono 6.8");
        languageList.put("28","D DMD32 v2.101.2");
        languageList.put("32","Go 1.19.5");
        languageList.put("12","Haskell GHC 8.10.1");
        languageList.put("60","Java 11.0.6");
        languageList.put("74","Java 17 64bit");
        languageList.put("36","Java 1.8.0_241");
        languageList.put("77","Kotlin 1.6.10");
        languageList.put("83","Kotlin 1.7.20");
        languageList.put("19","OCaml 4.02.1");
        languageList.put("3", "Delphi 7");
        languageList.put("4", "Free Pascal 3.0.2");
        languageList.put("51","PascalABC.NET 3.8.3");
        languageList.put("13","Perl 5.20.1");
        languageList.put("6", "PHP 8.1.7");
        languageList.put("7", "Python 2.7.18");
        languageList.put("31","Python 3.8.10");
        languageList.put("40","PyPy 2.7.13 (7.3.0)");
        languageList.put("41","PyPy 3.6.9 (7.3.0)");
        languageList.put("70","PyPy 3.9.10 (7.3.9, 64bit)");
        languageList.put("67","Ruby 3.0.0");
        languageList.put("75","Rust 1.66.0 (2021)");
        languageList.put("20","Scala 2.12.8");
        languageList.put("34","JavaScript V8 4.8.0");
        languageList.put("55","Node.js 12.16.3");
        return languageList;
    }

    @Override
    public HashMap<String, String> getLanguagesAdapter() {
        // TODO Auto-generated method stub
        return null;
    }

}
