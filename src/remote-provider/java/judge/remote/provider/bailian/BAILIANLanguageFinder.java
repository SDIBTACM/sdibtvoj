package judge.remote.provider.bailian;

import java.util.HashMap;
import java.util.LinkedHashMap;

import judge.remote.RemoteOjInfo;
import judge.remote.language.LanguageFinder;
import judge.tool.Handler;

import org.springframework.stereotype.Component;

@Component
public class BAILIANLanguageFinder implements LanguageFinder {

    @Override
    public RemoteOjInfo getOjInfo() {
        return BAILIANInfo.INFO;
    }

    @Override
    public boolean isDiverse() {
        return false;
    }

    @Override
    public void getLanguages(String remoteProblemId, Handler<LinkedHashMap<String, String>> handler) {
        // TODO Auto-generated method stub
    }

    @Override
    public LinkedHashMap<String, String> getDefaultLanguages() {
        LinkedHashMap<String, String> languageList = new LinkedHashMap<String, String>();
     languageList.put("0", "G++(9.3(with c++17))");
        languageList.put("1", "GCC(9.3)");
        languageList.put("2", "Java(OpenJDK14)");
        languageList.put("3", "Pascal(FreePascal)");
        languageList.put("4", "Python3(3.8)");
        languageList.put("5", "C#(mono6.8)");
        languageList.put("6", "Racket(7.2)");
        languageList.put("7","Go(1.14.3)");
        languageList.put("8","Rust(1.15)");
        languageList.put("9","PHP(7.4.3)");
        languageList.put("10","JavaScript(node10.19.0)");
        languageList.put("11","Ruby(2.7)");
        languageList.put("12","Haskell(ghc8.6.5)");
        languageList.put("13","R(3.6.3)");
        languageList.put("14","Lua(2.1.0)");
        languageList.put("15","bash(5.0.17)");
        languageList.put("16","awk(5.0.1)");
        languageList.put("17","VB(vbnc)");
        languageList.put("18","PyPy3(7.3.1)");
        languageList.put("19","Perl(5.30.0)");
        languageList.put("20","asm(nasm 2.14)");
        languageList.put("21","TypeScript(node10.19.0)");
        languageList.put("22","Kotlin(1.5.31)");

        return languageList;
    }

    @Override
    public HashMap<String, String> getLanguagesAdapter() {
        // TODO Auto-generated method stub
        return null;
    }

}
