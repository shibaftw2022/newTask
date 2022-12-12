import java.util.ArrayList;
import java.util.List;

public class Encoder {

private String offset;





    String table = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }


    public String encode(String plainText)
    {
        List<String> encoded = new ArrayList<>();
        int offsetValue = table.indexOf(offset);
        encoded.add(offset);
        for(int i=0; i< plainText.length(); i++)
        {
            if(!String.valueOf(plainText.charAt(i)).equals(" ") ) {
                String curr = String.valueOf(plainText.charAt(i));
                int currOffset = table.indexOf(curr) - offsetValue;
                if (currOffset < 0) {
                    currOffset = table.length() + currOffset;
                }
                encoded.add(String.valueOf(table.charAt(currOffset)));
            }
            else
            {
                encoded.add(String.valueOf(plainText.charAt(i)));
            }

        }
        return String.join("",encoded);
    }

    public String decode(String encodedText)
    {
        List<String> decoded = new ArrayList<>();
        int offsetValue = table.indexOf(String.valueOf(encodedText.charAt(0)));

        for(int i=1; i< encodedText.length(); i++)
        {
            if(!String.valueOf(encodedText.charAt(i)).equals(" ") ) {
                String curr = String.valueOf(encodedText.charAt(i));
                int currOffset = table.indexOf(curr) + offsetValue;
                if (currOffset > table.length() - 1) {
                    currOffset = currOffset % table.length();
                }
                decoded.add(String.valueOf(table.charAt(currOffset)));
            }
            else
            {
                decoded.add(String.valueOf(encodedText.charAt(i)));
            }

        }

        return String.join("",decoded);
    }
}
