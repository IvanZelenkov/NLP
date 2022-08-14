package nlp;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.List;

public class SentimentAnalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipeline();

        String text = "Hello! I am Ivan Zelenkov and I like fruits. But, I really do not like mango.";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> coreSentenceList = coreDocument.sentences();

        for (CoreSentence coreSentence : coreSentenceList) {
            String sentiment  = coreSentence.sentiment();
            System.out.println(sentiment + " = " + coreSentence);
        }
    }
}
