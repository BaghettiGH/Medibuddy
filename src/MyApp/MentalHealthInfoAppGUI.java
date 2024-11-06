package MyApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
  


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;




public class MentalHealthInfoAppGUI extends JFrame {
    
    public MentalHealthInfoAppGUI() {
        setTitle("Mental Health Information");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Dropdown for selecting mental health issues
        String[] issues = {"Depression", "Anxiety", "Bipolar Disorder", "PTSD"};
        JComboBox<String> issueComboBox = new JComboBox<>(issues);
        JTextArea infoTextArea = new JTextArea();
        infoTextArea.setEditable(false);
        infoTextArea.setLineWrap(true);
        infoTextArea.setWrapStyleWord(true);
 infoTextArea.setText( "\n\n\n                                                                                      Welcome to the Information Section \n\n" +
            "                                            This application provides information on various mental health issues, including: \n \n \n \n" +
            "                                                                                         Depression               Anxiety \n \n" +
        
            
            "                                                                                         Bipolar                       Disorder PTSD \n \n \n \n\n" +
            "                   To get started, please select a mental health issue from the dropdown menu above and click 'Show Information'. \n \n \n\n" +
            "                         You will find detailed information about symptoms, treatment options, and resources available for support.\n \n \n \n \n\n" +
            "                                                                                            Your mental health matters! \n \n" +
            "                             We're here to provide you with the information you need to understand and manage your mental health.");
        // Button to show information
        JButton showInfoButton = new JButton("Show Information");
        showInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedIssue = (String) issueComboBox.getSelectedItem();
                String info = getMentalHealthInfo(selectedIssue);
                infoTextArea.setText(info);
            }
        });
Font font = new Font("Arial", Font.BOLD, 16);
  infoTextArea.setFont(font);
        // Panel for layout
        JPanel panel = new JPanel();
        panel.add(issueComboBox);
        panel.add(showInfoButton);

        // Adding components to the frame
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(infoTextArea), BorderLayout.CENTER);
    }

    private String getMentalHealthInfo(String issue) {
        switch (issue) {
            case "Depression":
                return "\n " +
                        "        What is Depression? Depression is a mood disorder that causes a persistent feeling of sadness and loss of interest. Also called major depressive disorder or clinical      depression, it affects how you feel, think and behave and can lead to a variety of emotional and physical problems. You may have trouble doing normal day-to-day activities, and        sometimes you may feel as if life isn't worth living.\n\n" +
                        "Symptoms: \n" +
                  "    Although depression may occur only once during your life, people typically have multiple episodes. During these episodes, symptoms occur most of the day, nearly every day and       may include:\n \n" +
                  "     -Feelings of sadness, tearfulness, emptiness or hopelessness \n"+
                  "     -Angry outbursts, irritability or frustration, even over small matters\n"+
                  "     -Loss of interest or pleasure in most or all normal activities, such as sex, hobbies or sports\n"+
                  "     -Sleep disturbances, including insomnia or sleeping too much\n"+
                  "     -Tiredness and lack of energy, so even small tasks take extra effort\n"+
                  "     -Reduced appetite and weight loss or increased cravings for food and weight gain\n"+
                  "     -Anxiety, agitation or restlessness\n"+
                  "     -Slowed thinking, speaking or body movements\n"+
                  "     -Feelings of worthlessness or guilt, fixating on past failures or self-blame\n"+
                  "     -Trouble thinking, concentrating, making decisions and remembering things\n"+
                  "     -Frequent or recurrent thoughts of death, suicidal thoughts, suicide attempts or suicide\n"+
                  "     -Unexplained physical problems, such as back pain or headaches\n\n"+
                        
                  "When to get emergency help: \n\n"+
                  "     If you think you may hurt yourself or attempt suicide, call 911 or your local emergency number immediately. \n\n"+
                  "     Also consider these options if you're having suicidal thoughts: \n\n"+
                  "     Call your doctor or mental health professional.\n"+
                  "     Contact a suicide hotline. \n\n"+
                  "             -In Touch: Crisis Line: call +63919-056-0709 / +63917-800-1123 / +63922-893-8944 \n\n"+
                  "             -HOPELINE: Alternative numbers: 0917 558- 4673 (Globe and TM) and 0918 873 4673 (Smart). Facebook: https://www.facebook.com/HopelinePH/ \n\n"+
                  "             -Tawag Paglaum - Centro Bisaya:Alternate contact numbers: 0939-937-5433 0939-936-5433 \n\n";
            case "Anxiety":
                return"\n " +
                        "   What is Anxiety?\n" +
                    "       Anxiety is a common emotional response to perceived threats, uncertainties, or stressful situations. It’s the body’s way of preparing to face challenges, often called the \"fight or flight\" response. In small amounts, anxiety can actually be helpful as it keeps us alert and ready. However, when anxiety becomes excessive or persistent, it can lead to significant distress and affect one’s ability to function in daily life.\n" +
                    "\n" +
                    "       -Anxiety disorders occur when these feelings are disproportionate to the actual situation or when they persist for long periods. Some common anxiety disorders include: \n\n       -Generalized Anxiety Disorder (GAD): Characterized by excessive, uncontrollable worry about various aspects of life, such as work, health, or relationships.\n" +
                    "       -Social Anxiety Disorder: Involves intense fear of social situations or of being judged by others.\n" +
                    "       -Panic Disorder: Recurrent panic attacks, which are sudden episodes of intense fear that trigger physical symptoms, such as chest pain, dizziness, or shortness of breath.\n" +
                    "       -Phobias: Irrational and intense fears related to specific objects, places, or situations (e.g., heights, flying, or spiders).\n" +
                    "       -Obsessive-Compulsive Disorder (OCD): Involves repetitive thoughts (obsessions) and behaviors (compulsions) that one feels compelled to perform. \n \n" +
                      
                        "Symptoms:\n \n" +
                  "      Anxiety can affect people in different ways, and the symptoms can be physical, mental, or behavioral. Here’s a closer look at each category:\n \n" +
                  "     -Increased Heart Rate: Often a sign of the body's fight-or-flight response, this can make you feel like your heart is racing or pounding.\n" +
                  "     -Sweating and Trembling: Your body might react with sweating, shaky hands, or a feeling of being “on edge.”\n" +
                  "     -Shortness of Breath or Tightness in the Chest: This can make it difficult to breathe or feel like there’s pressure in the chest.\n" +
                  "     -Gastrointestinal Issues: Nausea, stomach aches, or digestive troubles are also common.\n" +
                  "     -Muscle Tension and Headaches: Physical discomfort and tight muscles, especially in the neck and shoulders, are frequent.  \n"+
                  "     -Racing Thoughts: Rapid, persistent thoughts that can be difficult to stop.\n" +
                  "     -Difficulty Concentrating: Feeling distracted or finding it hard to stay focused on tasks.\n" +
                  "     -Restlessness: A feeling of “not being able to sit still” or feeling constantly on edge. \n" +
                  "     -Anxiety can also impact behavior, leading to habits or actions that may make the problem worse:\n" +
                  "     -Avoidance: Avoiding specific places, people, or situations that might trigger anxiety.\n" +
                  "     -Isolation: Withdrawing from social interactions or activities that one used to enjoy.\n" +
                  "     -Over-preparation: For tasks that involve worry, people may over-prepare to try and control every aspect.\n \n" +
               
              
                        
                  "     Getting Help for Anxiety: \n\n"+
                  "      If anxiety is interfering with your life, here are some steps you can take to find support and relief: \n\n"+
                  "      Talk to a Mental Health Professional: \n \n" +
                  "      Professionals like psychologists, licensed counselors, and social workers can help you understand and address anxiety. They often use talk therapy, such as Cognitive-Behavioral Therapy (CBT), which is especially effective for managing anxiety. CBT helps identify and change negative thought patterns and behaviors that contribute to anxiety. \n\n"+
                  "      Practice Mindfulness and Relaxation Techniques: \n \n" +
                  "      Mindfulness Meditation, This practice involves staying present in the moment without judgment. Studies have shown that mindfulness can reduce anxiety by helping people focus on the present rather than future “what if” scenarios.\n" +
                  "      Deep Breathing Exercises: Breathing deeply and slowly can activate the body's relaxation response, reducing stress and anxiety. Techniques like box breathing (inhale for 4 seconds, hold for 4, exhale for 4, and hold again for 4) are often very effective.\n" +
                  "      Yoga and Progressive Muscle Relaxation (PMR): Yoga combines physical movement with breathing, which can help release tension and relax the mind. PMR is another technique that involves tensing and releasing muscles, helping you identify and reduce physical tension. \n\n"+
                  "      Develop Healthy Habits\n \n" +
                  "      Regular Exercise: Physical activity increases the production of endorphins, which are natural mood lifters. Activities like jogging, swimming, or even a brisk walk can reduce anxiety.\n" +
                  "      Balanced Diet: Eating a nutritious diet with sufficient vitamins and minerals can support mental health. Foods rich in Omega-3 fatty acids (like fish) and antioxidants (like fruits and vegetables) can positively impact mood and brain health.\n" +
                   "     Good Sleep Hygiene: Poor sleep can worsen anxiety, so maintaining a regular sleep schedule, limiting screen time before bed, and creating a relaxing bedtime routine can improve sleep quality.\n \n" +
                   "     Limit Stimulants and Alcohol\n \n" +
                   "     Reduce Caffeine Intake: Caffeine is a stimulant that can increase heart rate and anxiety. Limiting coffee, energy drinks, and even chocolate can help reduce anxiety symptoms.\n" +
                   "     Be Cautious with Alcohol: While alcohol might seem to calm anxiety initially, it can worsen anxiety symptoms over time. Alcohol affects the central nervous system, which can increase feelings of worry or unease, especially in the days following consumption.\n \n" +
                   "     Reach Out for Support \n \n" +
                   "     Support Groups: Both in-person and online support groups allow you to connect with others facing similar issues. Talking to people who understand your experience can provide relief and reduce isolation.\n" +
                   "     Trusted Friends and Family: Opening up to close friends or family members about your struggles can give you a sense of comfort. They can provide a support system and help you feel less alone.\n \n" +
                   "     Explore Online Resources and Apps\n \n" +
                   "     There are many mental health resources and apps designed to provide information, guided meditations, anxiety tracking, and coping strategies. Examples include Calm, Headspace, and BetterHelp, though it's best to explore different options to find what works for you.\n" +
                   "     Seeking help for anxiety can feel overwhelming, but early intervention can make a positive difference in managing symptoms and improving quality of life. Anxiety is common, and you’re not alone; support is available in many forms, from professional help to community resources and self-care strategies. \n\n";

                
                
            case "Bipolar Disorder":
                return "\n " +
                        "        What is Bipolar Disorder? Bipolar disorder is a mental health condition characterized by extreme mood swings that include emotional highs (mania or hypomania) and lows (depression). These shifts in mood and energy levels can significantly impact daily life, affecting relationships, job performance, and overall well-being.\n\n" +
                        "Bipolar disorder is a long-term mental health condition with recurrent mood episodes that are either manic or depressive. There are different types of bipolar disorder, including:\n" +
"\n" +
"       -Bipolar I Disorder: Defined by manic episodes lasting at least seven days, or by manic symptoms so severe they require immediate hospital care. Depressive episodes occur as well, typically lasting at least two weeks.\n" +
"       -Bipolar II Disorder: Characterized by a pattern of depressive and hypomanic episodes, but without full-blown manic episodes.\n" +
"       -Cyclothymic Disorder (Cyclothymia): A milder form involving numerous periods of hypomanic symptoms as well as periods of depressive symptoms lasting for at least two years in adults (one year in children and adolescents).\n \n"+
                        
                        "Symptoms: \n" +
                  "    Bipolar disorder symptoms fall into two main categories: manic (or hypomanic) episodes and depressive episodes:\n \n" +
                  "     Manic or Hypomanic Episodes: \n \n" +
                    "       During a manic episode, people experience elevated moods, high energy levels, and possibly risky behaviors. Symptoms may include:\n" +
                    "\n" +
                    "           -Euphoria or Irritability: Feeling extremely happy, “high,” or irritable.\n" +
                    "           -Increased Energy and Activity Levels: Feeling energized with little need for sleep, leading to hyperactivity.\n" +
                    "           -Decreased Need for Sleep: People may sleep less than usual but still feel energetic.\n" +
                    "           -Racing Thoughts and Rapid Speech: Jumping quickly from one idea to the next, sometimes leading to disorganized speech.\n" +
                    "           -Impulsive or Risky Behavior: Engaging in reckless activities like spending sprees, substance use, or unprotected sex.\n \n "+
                        
                  "    Depressive Episodes: \n \n" +
                "       During depressive episodes, individuals may feel overwhelming sadness or a lack of interest in life. Symptoms of depression in bipolar disorder can include:\n" +
                "\n" +
                "           -Feelings of Hopelessness and Sadness: A persistent low mood, often accompanied by feelings of worthlessness or guilt.\n" +
                "           -Loss of Interest in Activities: A decreased interest or pleasure in most daily activities, even those once enjoyed.\n" +
                "           -Fatigue or Low Energy Levels: Physical and mental exhaustion, feeling too tired to engage in daily tasks.\n" +
                "           -Difficulty Concentrating: Trouble focusing, making decisions, or remembering things.\n" +
                "           -Sleep Disturbances: Either insomnia (difficulty sleeping) or hypersomnia (sleeping too much).\n" +
                "           -Appetite Changes: This can involve either overeating or loss of appetite, often leading to weight changes.\n" +
                "           -Suicidal Thoughts or Actions: Thoughts of death or suicide, or even attempts, can occur during depressive phases.\n \n"+
                
                  "     Types of Episodes in Bipolar Disorder: \n \n" +
                "           -Mixed Episodes: Experiencing symptoms of both mania and depression simultaneously (e.g., feeling agitated and energized while also feeling hopeless or sad).\n" +
                "           -Rapid Cycling: Having four or more episodes of mania, hypomania, or depression within a year, which can make treatment more challenging.\n \n"+
                        
                  "    Getting Help for Bipolar Disorder: \n \n" +
                "           If you or someone you know has symptoms of bipolar disorder, seeking professional help is crucial, as early intervention can improve long-term outcomes. Here are some steps to consider:\n" +
                "\n" +
                "1. Consult a Mental Health Professional\n \n" +
                "           Psychiatrist: Psychiatrists can diagnose and create a personalized treatment plan, which may include medications and therapy. They can also monitor the effectiveness of treatment over time.\n" +
                "           Therapists and Counselors: They can provide ongoing support and coping strategies through therapy. Cognitive-Behavioral Therapy (CBT) and psychoeducation are often helpful for managing bipolar disorder.\n \n" +
                "2. Medication Management\n \n" +
                "           Mood Stabilizers: Medications like lithium or anticonvulsants are commonly prescribed to help stabilize mood swings.\n" +
                "           Antipsychotic Medications: Sometimes prescribed to manage severe mania or psychotic symptoms.\n" +
                "           Antidepressants (With Caution): May be used to treat depressive episodes but often in combination with mood stabilizers to avoid triggering a manic episode.\n" +
                "           Working with a psychiatrist to find the right medication(s) can be a process that requires time and patience, as different medications work differently for each person.\n" +
                "\n" +
                "3. Therapy Options: \n \n" +
                "           Cognitive-Behavioral Therapy (CBT): Helps individuals identify and change negative thought patterns and behaviors associated with mood episodes.\n" +
                "           Interpersonal and Social Rhythm Therapy (IPSRT): Focuses on stabilizing daily routines and sleep patterns, as regularity can help reduce mood swings.\n" +
                "           Family-Focused Therapy (FFT): Involves family members in therapy to improve communication, support, and understanding, creating a more stable support system for the individual.\n \n" +
                "4. Build Healthy Lifestyle Habits\n \n" +
                "           Regular Exercise: Physical activity can have a stabilizing effect on mood, improving overall well-being and reducing stress.\n" +
                "           Sleep Hygiene: Establishing a consistent sleep schedule is essential, as sleep disruption can trigger manic or depressive episodes.\n" +
                "           Balanced Diet: Eating regular, nutritious meals can help improve energy levels and stabilize mood.\n" +
                "           Limit Stimulants and Alcohol: Caffeine, alcohol, and recreational drugs can worsen mood instability and interfere with medications.\n \n" +
                "5. Establish a Support System \n \n" +
                "           Family and Friends: Open communication with trusted family and friends can be invaluable. They can offer emotional support and help recognize early signs of mood episodes.\n" +
                "           Support Groups: Support groups, either in person or online, provide a community of people facing similar challenges, offering understanding and shared coping strategies.\n \n" +
                "6. Track Mood Patterns\n \n" +
                "           Mood Journals or Apps: Logging daily mood, sleep patterns, and triggers can help in understanding one’s unique mood patterns. Many apps are available for this purpose, helping individuals and their healthcare providers monitor progress.\n" +
                "           Recognizing Early Warning Signs: Over time, people with bipolar disorder often become better at identifying early signs of mania or depression. Recognizing these signs can help them take preventive steps.\n \n" +
                "7. Crisis Planning\n" +
                "           Developing a Crisis Plan: A detailed plan for handling severe episodes, including emergency contacts, medication reminders, and a list of coping strategies, can help you and your support system manage crises more effectively.\n" ;
                
            case "PTSD":
                return "\n " +
                        "        What is PTSD? Post-Traumatic Stress Disorder (PTSD) is a mental health condition triggered by experiencing or witnessing a traumatic event. It can develop after a range of distressing events, such as combat, natural disasters, accidents, abuse, or the sudden loss of a loved one. While it's normal to feel fear and stress after a traumatic experience, PTSD occurs when these feelings persist and impact daily life, often months or even years later.\n\n" +
                       "        PTSD can affect anyone who has been through a traumatic event. Trauma impacts the brain’s ability to process experiences normally, making it hard to move past distressing memories and causing the individual to feel “stuck” in the trauma. PTSD symptoms can interfere with daily life, relationships, and physical health.\n \n" +

                        
                        "Symptoms: \n \n " +
                  "    PTSD symptoms generally fall into four main categories: intrusive memories, avoidance, negative changes in thoughts and mood, and changes in physical and emotional reactions:\n \n" +
                  "     Intrusive Memories\n\n" +
                    "           -Flashbacks: Reliving the traumatic event as if it's happening again.\n" +
                    "           -Nightmares: Distressing dreams related to the trauma.\n" +
                    "           -Disturbing Memories: Recurring, unwanted memories that are difficult to control.\n" +
                    "           -Emotional Distress: Feeling intense distress when reminded of the trauma (e.g., by sounds, smells, or similar situations). \n \n"+
                        
                  "     Avoidance\n\n" +
                    "           -Avoiding Reminders: Staying away from people, places, or activities that trigger memories of the trauma.\n" +
                    "          - Suppressing Thoughts and Feelings: Trying to avoid thinking about or discussing the traumatic event.\n \n"+
                        
                  "     Negative Changes in Thoughts and Mood\n\n" +
                    "           -Hopelessness and Guilt: Feeling negative about oneself or the world and carrying shame, guilt, or blame.\n" +
                    "           -Detachment: Becoming emotionally distant or disconnected from loved ones.\n" +
                    "           -Loss of Interest: Reduced interest in activities that were once enjoyable.\n" +
                    "           -Difficulty Experiencing Positive Emotions: Struggling to feel happiness or satisfaction. \n \n"+
                        
                        
                  "     Changes in Physical and Emotional Reactions (Arousal Symptoms) \n \n" +
                    "           -Irritability and Anger: Experiencing frequent anger, irritability, or frustration.\n" +
                    "           -Being Easily Startled: Becoming hypervigilant or jumpy, especially when reminded of the trauma.\n" +
                    "           -Trouble Sleeping: Difficulty falling or staying asleep due to anxiety or hyperarousal.\n" +
                    "           -Difficulty Concentrating: Having trouble focusing on tasks or conversations.\n \n"+
                        
                  "    Symptoms of PTSD can vary widely in intensity and duration. For some, symptoms may come and go, while others might experience chronic and debilitating symptoms. \n \n"+
                        
                  "     Types of PTSD \n \n" +
                  "         Different forms of PTSD may manifest depending on the individual’s experiences and symptom patterns:\n" +
                  "\n" +
                  "             -Acute PTSD: Symptoms last between one and three months after the trauma.\n" +
                  "             -Chronic PTSD: Symptoms last over three months and are typically more persistent and severe.\n" +
                  "             -Complex PTSD: Often develops in response to prolonged, repeated trauma (e.g., abuse, captivity). It includes the symptoms of PTSD along with additional emotional and relational difficulties.\n" +
                  "             -Dissociative PTSD: Characterized by symptoms of PTSD along with dissociation (feeling detached from oneself or reality).\n \n"+
                  "     -Anxiety, agitation or restlessness\n"+
                  "     -Slowed thinking, speaking or body movements\n"+
                  "     -Feelings of worthlessness or guilt, fixating on past failures or self-blame\n"+
                  "     -Trouble thinking, concentrating, making decisions and remembering things\n"+
                  "     -Frequent or recurrent thoughts of death, suicidal thoughts, suicide attempts or suicide\n"+
                  "     -Unexplained physical problems, such as back pain or headaches\n\n"+
                        
                  "Getting Help for PTSD: \n\n"+
                  "     If you or someone you know shows signs of PTSD, seeking help early can greatly improve the ability to manage and overcome symptoms. Here are several treatment options and support strategies: \n\n"+
                  "     Therapies for PTSD: \n \n" +
                "           -Trauma-Focused Cognitive-Behavioral Therapy (CBT): This therapy helps individuals identify and change negative thought patterns related to the trauma. Techniques such as exposure therapy (gradually facing trauma reminders) and cognitive restructuring (changing how you think about the trauma) are often used.\n" +
                "          - Eye Movement Desensitization and Reprocessing (EMDR): A structured therapy involving eye movements guided by a therapist to help the brain reprocess traumatic memories. EMDR can be highly effective in reducing the intensity of traumatic memories.\n" +
                "          - Prolonged Exposure Therapy (PE): A type of CBT where individuals gradually confront trauma-related thoughts, feelings, and situations they have been avoiding, reducing distress over time. \n\n"+
                  "     Medication \n\n" +
                "           -Antidepressants: Selective serotonin reuptake inhibitors (SSRIs), like sertraline and paroxetine, are commonly prescribed to help manage PTSD symptoms.\n" +
                "           -Anti-Anxiety Medications: These are sometimes used to alleviate symptoms of anxiety and panic in the short term, though they’re generally not a primary treatment for PTSD.\n" +
                "           -Prazosin: This medication is sometimes prescribed to reduce the severity and frequency of nightmares, a common PTSD symptom.\n" +
                "           -Medications are often most effective when combined with therapy, as they help manage symptoms while therapy addresses the underlying trauma.\n \n"+
                  "     Self-Help Strategies\n" +
                "           -Grounding Techniques: Grounding exercises, like focusing on one’s surroundings, counting objects, or concentrating on breathing, can help manage flashbacks and anxiety by keeping you anchored in the present.\n" +
                "           -Mindfulness and Relaxation Exercises: Practices like mindfulness meditation and deep breathing can help reduce hyperarousal and stress.\n" +
                "           -Maintaining a Routine: A structured daily routine can help provide stability, reduce stress, and create a sense of safety. \n\n " +
                "Practicing Self-Care \n \n" +
                "           -Regular Exercise: Physical activity, like walking, running, or yoga, can be particularly helpful for managing stress and supporting mental health.\n" +
                "           -Healthy Diet: Eating nutritious meals and avoiding alcohol and stimulants (like caffeine) can positively impact your mood and energy levels.\n" +
                "           -Adequate Sleep: Good sleep hygiene practices—such as maintaining a consistent sleep schedule, creating a relaxing bedtime routine, and limiting screen time before bed—can improve sleep quality, which often suffers due to PTSD symptoms.\n \n" +
                "Emergency and Crisis Resources \n \n" +
                "           -Crisis Hotlines: In moments of intense distress, hotlines like the National Suicide Prevention Lifeline or crisis text lines are available 24/7 to provide immediate support.\n" +
                "           -Safety Planning: Working with a therapist to develop a safety plan, including identifying trusted contacts and emergency resources, can be crucial in managing PTSD crises.";
                                        
            default:
                return "No information available.";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MentalHealthInfoAppGUI app = new MentalHealthInfoAppGUI();
            app.setVisible(true);
        });
    }
}
    

