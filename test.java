package xxx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@RestController
@RequestMapping("/api/PdfReader")
public class MIAPdfReaderController {
    @Autowired
    private Environment environment;

    @GetMapping("/getPdfBin")
    public String getPdfBin(String fileName) throws FileNotFoundException {
        String pdfPath = environment.getProperty("pdf.path");
        String file = fileName;
        File pdfFile = new File(System.getProperty("user.dir") + "/" + pdfPath + file);
        return "";
    }
}
