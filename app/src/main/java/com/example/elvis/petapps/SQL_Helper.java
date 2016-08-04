package com.example.elvis.petapps;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;


public class SQL_Helper extends SQLiteOpenHelper{
    public static final String TAG=SQL_Helper.class.getSimpleName();
    private static final String DATABASE_NAME="pet_db";
    private static final int VERSION=31;
    public static final String  PET_TABLE="pet_table";
    public static final String ID="_id";
    public static final String DOG_CARE="dog_care";
    public static final String CARE="care";
    public static final String PUPPY="puppy";
    public static final String PUPPY_TEXT="puppy_text";
    public static final String ADULT_DOG="adult_dog";
    public static final String ADULT_DOG_TEXT="adult_dog_text";
    public static final String DOG_BREED="dog_breed";
    public static final String DOG_BREED_TEXT="dog_breed_text";



    /*public static final String PUPPY_INTRO="puppy_intro";
    public static final String FEED_PUPPY="feed_puppy";
    public static final String PUPPY_EAT="puppy_eat";
    public static final String PUPPY_WEIGHT="puppy_weight";
    public static final String FEED_BASIS="feed_basis";
    public static final String FEED_TIPS="feed_tips";
    public static final String DOG_BONE="dog_bone";
    public static final String DOG_VITAMIN="dog_vitamin";
    public static final String DOG_EYE="dog_eye";
    public static final String DOG_EARS="dog_ear";
    public static final String DOG_TEETH="dog_teeth";
    public static final String DOG_BREATH="dog_breath";
    public static final String DOG_TOETAIL="dog_toetail";
    public static final String DOG_ARTHRITIS="dog_arthritis";
    public static final String DOG_DIABETES="dog_diabetes";
    public static final String DOG_DIARRHEA="dog_diarrhea";
    public static final String DOG_EAR_INFECTION="dog_eye_infection";
    public static final String DOG_EYE_DISCHARGE="dog_eye_discharge";
    public static final String DOG_HOT_SPOT="dog_hot_spot";
    public static final String DOG_LOWER_URINARY="dog_lower_urinary";
    public static final String DOG_OBSESSIVE_LICK="dog_obsessive";
    public static final String DOG_VOMITING="dog_vomitting";
    public static final String DOG_BREED_LABRA="dog_breed_Labrador";
    public static final String DOG_BREED_GOLDEN="dog_breed_golden";
    public static final String DOG_BREED_GERMAN="dog_breed_german";
    public static final String DOG_BREED_BULLDOG="dog_breed_bulldog";
    public static final String DOG_BREED_YORKSHIRE="dog_breed_yorkshire";
    public static final String DOG_BREED_POODLE="dog_breed_poodle";
    public static final String DOG_BREED_BEAGLE="dog_breed_beagle";
    public static final String DOG_BREED_FRENCH="dog_breed_french";
    public static final String DOG_BREED_DACHSHUND="dog_breed_dachshund";
    public static final String DOG_BREED_BOXER="dog_breed_boxer";*/


    private static final String  CREATE_TABLE="CREATE TABLE "+PET_TABLE+ "("+ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+ CARE+" TEXT, "
            + DOG_CARE+" TEXT, "+PUPPY+" TEXT,"+PUPPY_TEXT+" TEXT,"+ADULT_DOG+" TEXT,"+ADULT_DOG_TEXT+" TEXT,"+DOG_BREED+" TEXT,"+DOG_BREED_TEXT+" TEXT)";
    private static final String DROP_TABLE="DROP TABLE IF EXISTS "+PET_TABLE;

    public static final String  CAT_PET_TABLE="cat_pet_table";
    public static final String CAT_ID="_id";
    public static final String CAT="cat";
    public static final String CAT_TEXT="cat_text";
    public static final String CAT_BREED="cat_breed";
    public static final String CAT_BREED_TEXT="cat_breed_text";


   /* public static final String CAT_CARE="cat_care";
    public static final String FEED_KITTEN="feed_kitten";
    public static final String CAT_FEED_BESIDE="feed_besides";
    public static final String CAT_FEED_OFTEN="feed_often";
    public static final String CAT_FEED_BASIS="feed_basis";
    public static final String CAT_FEED_ERROR="feed_error";
    public static final String CAT_ADULT="cat_adult";
    public static final String CAT_VITAMIN="cat_vitamin";
    public static final String CAT_TIPS="cat_tips";
    public static final String CAT_GROOMING="cat_groom";
    public static final String CAT_BREATH="cat_breath";
    public static final String CAT_EAR="cat_ear";
    public static final String CAT_EYE="cat_eye";
    public static final String CAT_LICKING="cat_licking";
    public static final String CAT_DIABETICS="cat_diabetics";
    public static final String CAT_DIARRHIA="cat_diarrhia";
    public static final String CAT_HYPER="cat_hyper";
    public static final String CAT_KIDNEY="cat_kidney";
    public static final String CAT_URINARY="cat_urinary";
    public static final String CAT_SHEDDING="cat_shedding";
    public static final String CAT_VOMIT="cat_vomit";
    public static final String CAT_RESP="cat_resp";
    public static final String CAT_BREED_BOBTAIL="cat_breed_bobtail";
    public static final String CAT_BREED_CURL="cat_breed_curl";
    public static final String CAT_BREED_SHORTHAIR="cat_breed_shorthair";
    public static final String CAT_BREED_WIREHAIR="cat_breed_";
    public static final String CAT_BREED_BALINESE="cat_breed_balinese";
    public static final String CAT_BREED_BENGAL="cat_breed_bengal";
    public static final String CAT_BREED_BIRMAN="cat_breed_birman";
    public static final String CAT_BREED_BOMBAY="cat_breed_bombay";
    public static final String CAT_BREED_BRITISH="cat_breed_british";
    public static final String CAT_BREED_BURMESE="cat_breed_burmese";
*/

    private static final String  CREATE_CAT_TABLE="CREATE TABLE "+CAT_PET_TABLE+ "("+CAT_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + CAT+" TEXT, "+ CAT_TEXT+" TEXT, "+ CAT_BREED+" TEXT, "+ CAT_BREED_TEXT+" TEXT)";

    private static final String DROP_CAT_TABLE="DROP TABLE IF EXISTS "+CAT_PET_TABLE;
    private Context context;




    public SQL_Helper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        db.execSQL(CREATE_CAT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL(DROP_TABLE);
      db.execSQL(DROP_CAT_TABLE);
        onCreate(db);
    }

    public void insert_to_db2(String db_column1,String db_column2, String title1, String title2){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(db_column1, title1);
        contentValues.put(db_column2, title2);
        db.insert(PET_TABLE, null, contentValues);
        Log.v(TAG, "inserted into database");
    }

    public void insert_to_db2_cat(String db_column1,String db_column2, String title1, String title2){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(db_column1, title1);
        contentValues.put(db_column2, title2);
        long id=db.insert(CAT_PET_TABLE, null, contentValues);
        if(id<0){
           // Message.message(context, "The Symptom you entered is not in our datababe");
        }
        Log.v(TAG, "inserted into database");
    }

   /* public void insert_to_db_cat(String db_column, String title){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(db_column, title);
        db.insert(CAT_PET_TABLE, null, contentValues);
        Log.v(TAG, "inserted");
    }



    public String retrieve_from_cat_table(String db_column) {
        SQLiteDatabase db = getWritableDatabase();
        String[] column = {CAT_ID, db_column};
        Cursor cursor = db.query(CAT_PET_TABLE, column, null, null, null, null, null);
        cursor.moveToLast();
        int text = cursor.getColumnIndex(db_column);
        String data = cursor.getString(text);
        return data;
    }

    public void insert_to_db(String db_column, String title){
        SQLiteDatabase db=getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(db_column, title);
        db.insert(PET_TABLE, null, contentValues);
        Log.v(TAG, "inserted");
    }

    public String retrieve(String db_column) {
        SQLiteDatabase db = getWritableDatabase();
        String[] column = {ID, db_column};
        Cursor cursor = db.query(PET_TABLE, column, null, null, null, null, null);
        cursor.moveToLast();
        int text = cursor.getColumnIndex(db_column);
        String data = cursor.getString(text);
        return data;
    }*/

    Cursor cursor=null;
    public String retrieve2(String db_column1,String db_column2,String getpuppy) {
        SQLiteDatabase db = getWritableDatabase();
        String[] argrumentSeleection = {getpuppy};
        String[] column = {ID, db_column1, db_column2};
        cursor = db.query(PET_TABLE, column, db_column1 + " =?", argrumentSeleection, null, null, null, null);
        //String[] column = {ID, db_column};
        //Cursor cursor = db.query(PET_TABLE, column, null, null, null, null, null);
        if (cursor != null) {
            if (cursor.moveToLast()) {
                int column2 = cursor.getColumnIndex(db_column2);
                String column_text = cursor.getString(column2);
                return column_text;
            } else {
                Message.message(context, "Sorry, the symptoms is not in our database");
                //return null;
            }
        }
            /*else{
                Message.message(context, "not successful");
                return null;
            }*/
        return null;
        }
    public String retrieve2_from_cat_table(String db_column1,String db_column2,String getpuppy) {
        SQLiteDatabase db = getWritableDatabase();
        String[] argrumentSeleection={getpuppy};
        String[] column={ID, db_column1, db_column2};
        Cursor cursor=db.query(CAT_PET_TABLE, column, db_column1 + " =?" , argrumentSeleection, null, null, null, null);
        //String[] column = {ID, db_column};
        //Cursor cursor = db.query(PET_TABLE, column, null, null, null, null, null);
        if (cursor != null) {
            if (cursor.moveToLast()) {
                int column2 = cursor.getColumnIndex(db_column2);
                String column_text = cursor.getString(column2);
                return column_text;
            } else {
                Message.message(context, "Sorry, the symptoms is not in our database");
                //return null;
            }
        }

        return null;
    }


    String kitten_care="kitten care";
    String kitten_care_title="During the first few weeks of life, a kitten’s primary concerns are feeding," +
            " keeping warm, developing social skills and learning how to excrete on his own. In most " +
            "cases, humans will simply watch the mother cat perform her duties. However, if the kitten" +
            " in your care has been separated from his mother or if the mother cat has rejected her " +
            "young or cannot produce enough milk, caring for him is up to you.";


    String kitten_feed="kitten feed";
   String kitten_feed_title="A mother cat’s milk provides everything a kitten needs during the first" +
           " four weeks of life. If you have newborn kittens who’ve been separated from their mother," +
           " consult with a veterinarian, shelter or experienced foster care giver who can help you " +
           "find a new mother cat with a small litter-she may be able to nurse the orphaned babies. " +
           "If you cannot find a foster mother, please consult with your veterinarian about the proper " +
           "way to bottle-feed with a commercial milk replacer. Please do not offer regular cow’s milk " +
           "to cats of any age. It is not easily digestible and can cause diarrhea.";

    String cat_besides="cat besides";
   String cat_besides_title="When the orphaned kittens are three to four weeks old, begin to offer milk" +
           " replacer in a shallow bowl, then introduce a moist, easily chewable diet. You can make gruel" +
           " from warmed milk replacer and a high-quality dry or canned kitten food. Serve it in a shallow" +
           " bowl and feed the kittens several times each day. By five weeks old, they should be getting" +
           " used to their new diet. By six to seven weeks old, they should be able to chew dry food and " +
           "you’ll no longer need to moisten it. Kittens are typically fully weaned by around eight weeks " +
           "of age. Kittens need large amounts of energy--about two to three times that of an adult cat. " +
           "Food for your kitten should contain at least 30% protein. Make sure the food you offer is " +
           "specifically formulated for kittens.";

    String cat_often="cat often";
    String cat_often_title="The following is a general eating schedule for newborns and young cats:\n" +
            "•\tNewborn kittens may nurse about every 1-2 hours.\n" +
            "•\tAt about three to four weeks old, they can be offered milk replacer from a bowl and then small amounts of moistened kitten food four to six times a day.\n" +
            "•\tKittens from six to 12 weeks old should be fed four times a day as you gradually decrease their access to milk replacer.\n" +
            "•\tKittens from three to six months old should be fed three times a day.\n";


    String cat_basis="cat basis";
    String cat_basis_title="Cats are carnivores. That's the most important thing to keep in mind when considering what to feed yours.\n" +
            "\"Cats are… different from us and from dogs,\" says Louise Murray, DVM, vice president of the ASPCA's Bergh Memorial Animal Hospital in New York. \"When it comes to nutrition, they are very inflexible, and owners must realize that.\"\n" +
            "Compared to what their owners should be eating, cats need to eat a lot of meat for protein and for fat.\n" +
            "\"If we ate like cats, we'd have heart disease by age 20,\" Murray says. \"They are not at all the same as humans and they are not little dogs.\"\n" +
            "She's explicit about this because it's not uncommon for owners to treat their cats the same way they treat dogs, which can eat a variety of foods and remain healthy.\n";


    String cat_feed="cat feed";
    String cat_feed_error="We make plenty of mistakes feeding ourselves. We eat too much sugar and salt, we eat too little, then too much. With all the problems we have with our own diets, is it any wonder we make mistakes when feeding our cats?\n" +
            "So what errors are we making and why? Our cats can’t tell us, not with words. Sometimes we don’t know where we’ve gone wrong until our cat is sick.\n" +
            "Cat Feeding Mistakes: Too Much Food\n" +
            "Probably the most common mistake people make when feeding cats is over-feeding, says Joe Bartges, DVM, PhD, DACVIM, DACVN, professor of medicine and nutrition, the Acree Endowed Chair of Small Animal Research, in the College of Veterinary Medicine, at the University of Tennessee. “Obesity is the most common nutritional disease seen in cats.”\n" +
            "Although a pudgy kitty may look kind of cute, obesity is associated with cat health issues including diabetes, arthritis , and urinary tract disease. In fact, Bartges tells WebMD that cats may suffer from something similar to that very human condition, metabolic syndrome.\n" +
            "It’s not necessarily that we’re intentionally giving our cats more food than they need, says Linda P. Case, MS, author of The Cat: Its Behavior, Nutrition, and Health. It’s that our kitties “are more sedentary, as compared to the days when they were barn cats and more active. They're little couch potatoes now, their nutrition needs are much lower, so it's easy to overfeed them.”\n" +
            "So how much food does your cat need? That’s a question best answered by a professional, though recommendations range between 24 to 35 calories a day per pound, to keep cats at a normal, healthy weight.\n";


    String cat_adult="cat adult";
    String cat_adult_title="Jennifer Larsen, DVM, PhD is a nutritional consultant and assistant professor of clinical nutrition at the William R. Pritchard Veterinary Medical Teaching Hospital at UC Davis in California. Although manufacturer reputation is one reliable indicator of the quality of adult cat food, she says the American Association of Feed Control Officials (AAFCO) provides some added assurance of sound nutrition. You can check for the AAFCO statement on your cat’s food label.\n" +
            "\n" +
            "AAFCO uses two methods to evaluate the nutritional adequacy of adult cat foods: formulation and feeding test.\n" +
            "The formulation method involves doing a nutritional analysis of ingredients and comparing it with AAFCO nutrient profiles for a cat’s particular life stage. “That diet doesn’t have to be fed to any live animal before it’s sold,” Larsen says.\n" +
            "The feeding test method evaluates the digestibility and absorption of nutrients in live animals. “I strongly prefer foods that have been through AAFCO feeding tests,” Larsen says.\n";


    String cat_vitamin="cat vitamin";
    String cat_vitamin_title="Supplements may be recommended if your cat is sick.\n" +
            "“There are some circumstances where a cat has an underlying condition that may warrant a supplement, but many supplements are untested and unproven in veterinary medicine. The key point is that most cats consuming a complete and balanced diet probably have a better balanced diet than most humans,” says Sherry Sanderson, DVM, PhD, of the University of Georgia College of Veterinary Medicine.\n" +
            "Supplements are meant to correct deficiencies.\n" +
            "For example, your cat may need a supplement if she has a medical condition that makes her unable to absorb a particular nutrient. Small intestinal disease can cause an inability to absorb the B vitamins folate and cobalamine. In this case, the cat would require injections of those two supplements, as oral supplements won’t be absorbed either.\n" +
            "Cats that are pregnant and nursing may develop nutritional deficiencies that require supplementation, particularly if the cat becomes pregnant before age 10-12 months, Cruz says. Your vet can direct you to the appropriate product.\n";


    String cat_tips="cat tips";
    String cat_tips_title="•\tProduct name: What kind of cat food is it? The product name usually highlights a key ingredient, but not always.\n" +
            "•\tNet weight: How much is in the container?\n" +
            "•\tStatement of purpose or intent: Somewhere on the package, it must say that this food is specifically for cats. This sounds like a no-brainer, but cats have very particular nutritional needs that demand they have certain things in their diet.\n" +
            "•\tIngredient list: By law, ingredients must be listed in decreasing order according to weight. But keep in mind, moisture content affects weight. So ingredients that are moisture-heavy, such as chicken or lamb, are listed higher on the ingredient list than the same ingredient that is added in a dry form.\n" +
            "•\tGuaranteed analysis: States the minimum or maximum amount of certain nutrients, including protein, fat, and fiber. Nutrients are different from ingredients.\n" +
            "•\tFeeding directions: Explains how to feed the product to the cat. Such directions are to be considered general guidelines, not rules. Ask your veterinarian for specific instructions.\n" +
            "•\tNutritional adequacy statement: This tells you for which specific lifestyle and age of cat the food is intended. For example, is it for growing kitties or full-grown felines?\n" +
            "•\tStatement of responsibility: Lists the company responsible for making the product and how you can contact them.\n";


    String cat_groom="groom";
    String cat_groom_title="Your feline will look (and feel!) like the cat’s meow after a good grooming session.\n" +
            "By nature, cats are extremely fastidious. You’ve no doubt watched your kitty washing herself several times a day. For the most part she can take care of herself very well, thank you, but sometimes she’ll need a little help from you.\n" +
            "Make Grooming as Enjoyable as Possible -- For the Both of You\n" +
            "Grooming sessions should be fun for the both of you, so be sure to schedule them when your cat’s relaxed, perhaps after exercise or eating. You want your pet to remember grooming sessions in a positive way, so you never want to risk losing your temper. If you’ve had a stressful day or are in a bad mood, it’s probably not a good time to groom your cat.\n" +
            "Keep your first grooming sessions short-just 5 to 10 minutes. Gradually lengthen the time until your pet is used to the routine. You should also get your pet used to being handled. Get in the habit of petting every single part of your cat-including ears, tail, belly and back-and especially the feet!\n" +
            "And keep in mind, a little patience can go a long way. If your cat is extremely stressed out, cut the session short and try again when she’s calmer. Unfortunately, most cats do not like baths, so you may need another person to help. And remember to pile on the praise and offer her a treat when the session is over.\n" +
            "Brushing\n" +
            "Regular sessions with a brush or comb will help keep your pet’s hair in good condition by removing dirt, spreading natural oils throughout her coat, preventing tangles and keeping her skin clean and irritant-free.\n" +
            "If your cat has short hair, you only need to brush once a week:\n" +
            "•\tFirst, use a metal comb and work through her fur from head to tail.\n" +
            "•\tNext, use a bristle or rubber brush to remove dead and loose hair.\n" +
            "•\tBe extra-gentle near her chest and belly.\n" +
            "If your cat has long hair, you will need to brush every day:\n" +
            "•\tStart by combing her belly and legs; be sure to untangle any knots.\n" +
            "•\tNext, brush her fur in an upward motion with a bristle or rubber brush.\n" +
            "•\tTo brush her tail, make a part down the middle and brush the fur out on either side.\n";


    String cat_bad="breath";
    String cat_bad_breath="Bad breath, also known as halitosis, can be caused by a variety of health problems. Don’t worry, your cat’s breath isn’t supposed to smell minty fresh-but if there’s an extremely strong, fetid odor, there could be an underlying medical problem.\n" +
            "What Could Be Causing My Cat's Bad Breath?\n" +
            "Most often, bad breath is caused by a build-up of odor-producing bacteria in your pet’s mouth. This can be a result of dental or gum disease; certain cats, in fact, may be especially prone to plaque and tartar. Diet and dermatological issues can also be contributing factors. However, persistent bad breath can also indicate more serious medical problems such as abnormalities in the mouth, respiratory system, gastrointestinal tract, liver or kidneys. In all cases, halitosis is a red flag that should be investigated.\n" +
            "How Can I Determine the Cause of My Cat's Bad Breath?\n" +
            "Your veterinarian is the best person to pinpoint the cause. A physical examination may reveal the cause of your cat’s problem. If not, further tests will likely be recommended. Be ready to answer questions about your cat’s diet, oral hygiene, exercise habits and general attitude and behavior.\n" +
            "When Is It Time to See the Vet?\n" +
            "The following symptoms will require veterinary attention: \n" +
            "•\tExcessive brownish tartar on your cat’s teeth, especially when accompanied by drooling, difficulty eating and red, inflamed gums, could indicate serious dental or gum disease.\n" +
            "•\tUnusually sweet or fruity breath could indicate diabetes, particularly if your cat has been drinking and urinating more frequently than usual.\n" +
            "•\tBreath that smells like urine can be a sign of kidney disease.\n" +
            "•\tAn unusually foul odor accompanied by vomiting, lack of appetite, and yellow-tinged corneas and/or gums could signal a liver problem.\n" +
            "•\tPawing at the mouth\n" +
            "How Is Bad Breath Treated?\n" +
            "Treatment depends on your vet’s diagnosis. If plaque is the culprit, your cat might require a professional cleaning. If the cause is gastrointestinal or an abnormality in your pet’s liver, kidneys or lungs, please consult your vet about steps you should take.\n";


    String cat_ear="ear";
  String cat_ear_title="Your cat’s ears may be able to pick up the sound of a bag of treats being opened across the house, but they could still use a little help staying clean and healthy. Monitoring your cat’s ears weekly for wax, debris, and signs of infection will help those sensitive ears stay perky and alert to your every move.\n" +
          "Outer Ear Appearance\n" +
          "A healthy feline outer ear, or pinna, has a layer of hair on its outer surface with no bald spots, and its inner surface is clean and light pink. If you see any discharge, redness or swelling, your cat’s ears should be checked by a veterinarian.\n" +
          "Outer Ear Exam\n" +
          "Bring your cat into a quiet room where there are no other pets. Gently fold back each outer ear and look down into the canal. Healthy outer ears will be pale pink in color, carry no debris or odor, and will have minimal or no visible earwax. If you find that your cat’s ears appear to have excessive amounts of wax, have dark colored debris, or you detect an odor, your cat should be examined by your veterinarian.\n" +
          "Ear Cleaning 101\n" +
          "Place a little bit of liquid ear cleaner (ask your vet for a recommendation) onto a clean cotton ball or piece of gauze. Fold your cat’s ear back gently and wipe away any debris or earwax that you can see on the inside of the outer ear. Lift away the dirt and wax rather than rubbing it into the ear Do not attempt to clean the ear canal-probing inside of your cat’s ear can cause trauma or infection and is best done by a veterinary professional.\n" +
          "Signs of Ear Problems\n" +
          "Watch for the following signs that may indicate your cat’s ears should be checked by a veterinarian:\n" +
          "•\tPersistent scratching and pawing of the ear or surrounding area\n" +
          "•\tSensitivity to touch around the ears\n" +
          "•\tHead tilt\n" +
          "•\tFrequent shaking of the head\n" +
          "•\tLoss of balance and disorientation\n" +
          "•\tRedness or swelling of the outer ear or ear canal\n" +
          "•\tUnpleasant odor\n" +
          "•\tBlack or yellowish discharge\n" +
          "•\tAccumulation of dark brown wax\n" +
          "•\tHearing loss\n" +
          "•\tBleeding from the ear\n" +
          "Know Your Ear Disorders\n" +
          "•\tEar mites are common parasites that are contagious among pets. Telltale signs include excessive itching of the ears and debris that resembles coffee grounds.\n" +
          "•\tEar infections are usually caused by bacteria or yeasts. Treatment should be sought promptly as ear infections can cause considerable discomfort. Allergies in cats can be a predisposing factor in developing ear infections.\n" +
          "•\tAn ear hematoma is a collection of blood and serum between the cartilage and skin of the outer ear. They’re often caused by infection, ear mites, fleas or trapped debris that causes your cat to scratch her ears or shake her head excessively. They can occur in association with frequent head shaking in association with ear infections, ear mites, or allergies. But it can be seen in animals with normal ears.\n" +
          "How to Administer Ear Drops\n" +
          "If your veterinarian has recommended ear drops or ointment for your cat, please ask for his/her advice on how to properly administer them. Below are general guidelines on administering medications in your cat's ears:\n" +
          "•\tRead the label instructions carefully for correct dosage before administering.\n" +
          "•\tIf there is debris or excessive wax in the outer ear or visible ear canal gently clean the external ear with a cotton ball or gauze moistened with a veterinary recommended ear cleaning solution\n" +
          "•\tGently pull the ear flap back, squeeze out the correct amount of solution or ointment into the outermost earl canal\n" +
          "•\tGently massage the base of the ear to help work the medication deeper into the canal.\n" +
          "•\tAdminister the medication according to the label directions given by your veterinarian. Not completing the entire course of treatment can interfere with total resolution of the issue being treated.\n";


    String cat_eyes="eyes";
    String cat_eye_title="Seeing “eye to eye” with your cat may be one of the best things you ever do for her health. A good home eye exam just before grooming can clue you into any tearing, crust, cloudiness or inflammation that may indicate a health problem. Here are few simple tips to keep your kitty’s eyes bright, healthy and on the prize-you!\n" +
            "Home Inspection\n" +
            "Face your cat in a brightly lit area and look her in the eyes. They should be clear and bright, and the area around the eyeball should be white. Her pupils should be equal in size.\n" +
            "A Closer Look\n" +
            "Roll down your kitty’s eyelid gently with your thumb and take a look at the lid’s lining. It should be pink, not red or white.\n" +
            "What to Watch Out For\n" +
            "How can you tell if there is something wrong with one or both of your cat’s eyes? Look out for the following:\n" +
            "•\tDischarge\n" +
            "•\tWatering\n" +
            "•\tRed or white eyelid linings\n" +
            "•\tCrusty gunk in the corners of the eye\n" +
            "•\tTear-stained fur\n" +
            "•\tClosed eye(s)\n" +
            "•\tCloudiness or change in eye color\n" +
            "•\tVisible third eyelid\n" +
            "Eye-Catching Behavior\n" +
            "Certain body language will also alert you to possible eye distress. If your cat is constantly squinting or pawing at her eye area, give her eyes a good inspection. If you find any of the above symptoms, you should immediately call your vet.\n" +
            "A Little Wipe Goes A Long Way\n" +
            "Wipe away any crusty gunk from your cat’s eyes with a damp cotton ball. Always wipe away from the corner of the eye, and use a fresh cotton ball for each eye. Snip away any long hairs that could be blocking her vision or poking her eyes. Try not to use eye washes or eye drops unless they’ve been prescribed by your vet. If you notice unnatural discharge during your grooming session, consult your vet.\n" +
            "Know Thy Eye Disorders\n" +
            "The following eye-related disorders are commonly seen in cats:\n" +
            "•\tConjunctivitis: One or both of your cat’s eyes will look red and swollen, and there may be discharge.\n" +
            "•\tThird eyelid protrusion: If the third eyelid becomes visible or crosses your cat’s eye, he may have a wound or may be suffering from diarrhea, worms or a virus.\n" +
            "•\tKeratitis: If your cat’s cornea becomes inflamed, the eye will look cloudy and watery.\n" +
            "•\tCataracts: This opacity on the eye is often seen in elderly and diabetic cats.\n" +
            "•\tGlaucoma: The cornea becomes cloudy and the eye enlarges due to an increased pressure in the eyeball.\n" +
            "•\tBulging eye: Bulging can occur because of accident or trauma or an eye tumor.\n" +
            "•\tRetinal disease: Partial or total vision loss can happen when light-sensitive cells at the back of the eye degenerate.\n" +
            "•\tWatery eyes: The fur around your cat’s eyes may be stained with tears because of blocked tear ducts or an overproduction of tears.\n" +
            "\n" +
            "Treating Eye Conditions\n" +
            "Many feline eye disorders can be treated with vet-prescribed drops or ointments-your vet will show you how to apply eye and ear drops at home. \n" +
            "Preventing Eye Problems\n" +
            "The best way to prevent eye conditions is to make sure your cat gets all her vaccinations and has thorough check-ups. Please examine her eyes regularly and consult a vet if you find any abnormalities. Eye conditions that are left untreated can lead to impaired sight or even blindness.\n" +
            "\n";


    String cat_lick="lick";
    String cat_lick_article="Most cats are meticulous groomers, but what happens when the behavior goes into overdrive? For a variety of reasons, some cat licking, scratching, and chewing behaviors become compulsive, which can annoy you and damage your pet’s skin and coat.\n" +
            "If your cat is scratching, licking, or chewing herself compulsively, it is likely you regularly catch her in the act. But if you don’t, your first clue may be the disappearance of your cat’s fur, often in strips along her back or stomach. Cats with self-mutilating behaviors may also cause red, irritated areas called hot spots to form, but they are less likely than dogs to do so.\n" +
            "Although compulsive cat scratching, licking, or chewing behaviors can develop in any animal, they are more commonly observed in Siamese cats and other Oriental breeds. Female cats are more likely than males to lick, chew, or pull on their fur.\n" +
            "Because there are a number of medical problems that may result in scratching and licking behaviors, be sure to consult with your veterinarian to help determine the cause and the best course of action.\n" +
            "Why Do Cats Compulsively Scratch, Lick, or Chew?\n" +
            "Parasites. Fleas are often the culprits behind compulsive cat scratching or cat licking behaviors. Because cats are excellent groomers, they may actually remove all traces of fleas. If you notice your cat licking his lower back obsessively, with or without scabs on the neck, it is a sign that fleas might be causing the problem. Other parasites, including ticks, mites, and ringworm, can also prompt scratching, licking, or chewing.\n" +
            "Allergies. Just as some people develop skin irritations in response to certain foods or environmental triggers, cats may have itchy, irritated skin if they are allergic to something in their environment.\n" +
            "Dry skin. Dry winter air or nutritional inadequacies can contribute to dry, flaky skin that gets your cat started licking or scratching in search of relief.\n" +
            "Pain. If you notice your cat licking or biting at the same spot over and over again, it could be that he is experiencing pain or discomfort in that area.\n" +
            "Boredom, anxiety, or compulsive disorder. Compulsive cat chewing, scratching, or licking behaviors often develop in cats who are bored, stressed, or anxious. These mental disorders are more likely to occur in indoor cats, which may be due to the fact that they receive less exercise and excitement than outdoor cats. Compulsive disorders often begin when there are changes in a cat’s environment, including a new animal or baby in the house or a move to a new location. Also, behaviors that started in response to a medical problem sometimes persist as compulsions after the condition is resolved.\n" +
            "\n" +
            "Eliminating parasites. Because it can be difficult to diagnose flea infestation in cats, some veterinarians recommend trying reliable flea control products purchased from a veterinary office for six to eight weeks to see if it reduces the incidence of licking, scratching, or chewing. Similarly, treating mites or other parasites, if present, can eliminate your cat’s discomfort and the problem behaviors.\n" +
            "Changing foods. Putting cats that are scratching or chewing on a 6-week exclusion diet is a good way to find out whether food allergies are the problem. You may have to try several diets before you find one that works. Veterinarians may also prescribe the addition of certain fatty acids or other nutritional supplements if dry skin is to blame for your cat’s incessant scratching and licking. No other foods or treats should be offered during an exclusion diet trial.\n" +
            "Using medication. Depending on the extent of skin damage your cat has caused by licking, chewing, or scratching, your veterinarian may prescribe the use of steroids, antihistamines, and antibiotics. Additionally, some compulsive cat behaviors caused by psychological factors can be addressed with clomipramine, an anti-anxiety medication, or amitriptyline, which helps fight anxiety and also functions as an antihistamine.\n" +
            "Addressing anxiety or boredom. If you and your vet determine that there is no physical cause for your pet's behaviors, there are things you can do to improve your cat’s state of mind. Making sure your cat feels safe, loved, and comfortable in your home is important, as is providing adequate stimulation and exercise. You may find that desensitizing your cat by slowly and carefully exposing her to things she fears can be beneficial. Be careful to take baby steps if you try this so as not to overwhelm your cat and make the compulsive licking, scratching or biting worse. Counter-conditioning, by training your cat to associate something pleasurable, like a treat, with something he fears may also help reduce stress and anxiety. Many times, boredom licking (also known as psychogenic alopecia) is improved by adding another cat or pet. But, there is always the risk that the second cat could be a new stress in your pet's environment that could make the hair loss worse.\n";


    String cat_diabtics="diabetics";
    String cat_diabtics_title="An alarming number of cats are developing diabetes mellitus, which is the inability to produce enough insulin to balance blood sugar, or glucose, levels . Left untreated, it can lead to weight loss, loss of appetite, vomiting , dehydration, severe depression, problems with motor function, coma, and even death. To find out why so many cats are being diagnosed with diabetes, and what owners can do, WebMD talked to Thomas Graves, a former feline practitioner who is associate professor and section head of small animal medicine at the University of Illinois College of Veterinary Medicine. Graves’ research focus is on diabetes and geriatric medicine. \n" +
            "Q: How common is feline diabetes? \n" +
            "A: The true incidence isn’t known, but it’s estimated at 0.5% to 2% of the feline population. But it’s also probably under diagnosed. \n" +
            "Q: What are the signs of diabetes in cats? \n" +
            "A: The main symptoms are increased thirst and increased urination. And while we do see it in cats with appropriate body weight, it’s more common in obese cats. Some cats with diabetes have a ravenous appetite because their bodies cannot use the fuel supplied in their diet. \n" +
            "Q: What’s the treatment for a cat with feline diabetes? \n" +
            "A: Diet is certainly a component. It’s felt that a low-carbohydrate diet is probably best for cats with diabetes. Treatment is insulin therapy. There are some oral medications, but they have more side effects and are mainly used when insulin can’t be used for some reason. There are blood and urine tests, physical examinations, and behavioral signals, which are used to establish insulin therapy. This is done in conjunction with your veterinarian. We don’t recommend owners adjust insulin therapy on their own because it can be sort of complicated in cats. Most patients come in every three or four months. It’s a good thing to make sure nothing else is going on. \n";


    String cat_diarrhia="diarrhea";
    String cat_diarrhia_title="Diarrhea is characterized by frequent loose or liquid bowel movements. It can be caused by something as simple as a change in diet or a more serious illness or infection. Diarrhea may be sudden in onset and short in duration. It can also last for weeks to months or occur off and on. A single bout of diarrhea is generally not a cause for concern in cats-but if it persists for more than a day or two, it can lead to dehydration.\n" +
            "What Causes Diarrhea?\n" +
            "•\tChange in diet\n" +
            "•\tDairy or other food intolerance\n" +
            "•\tIngestion of spoiled food\n" +
            "•\tAllergic reaction\n" +
            "•\tBacterial or viral infection\n" +
            "•\tInternal parasites, such as roundworms, coccidia and Giardia\n" +
            "•\tInflammatory bowel disease\n" +
            "•\tKidney or liver disease\n" +
            "•\tCancer or other tumors of the digestive tract\n" +
            "•\tCertain medications\n" +
            "•\tHyperthyroidism\n" +
            "•\tColitis\n" +
            "What Are the General Symptoms of Diarrhea?\n" +
            "Loose, frequent stools are the most common symptoms of diarrhea. Other signs include flatulence, the passage of blood in mucus or stool and straining to defecate. Lethargy, dehydration, fever, vomiting, decreased appetite, weight loss and an increased urgency to defecate may also accompany diarrhea.\n" +
            "If your cat’s diarrhea is accompanied by bloody or black stools, he could be experiencing internal bleeding of the stomach or small intestine and should be examined by a vet immediately.\n" +
            "How Do I Treat Diarrhea?\n" +
            "It is often recommended that you avoid giving your pet any food for 12-24 hours while he’s experiencing diarrhea, but do provide plenty of fresh, clean water to stave off dehydration. Check with your veterinarian about the proper course of treatment for your cat’s specific case.\n" +
            "When Should I Take My Cat to the Vet?\n" +
            "Bring your cat to the vet if his diarrhea continues for more than a day, or if you observe lethargy, vomiting, fever, dark-colored or bloody stools , straining to defecate, decreased appetite or unexplained weight loss.\n";


    String cat_hyp="hyper";
    String cat_Hyper="Hyperthyroidism is the most common glandular disorder in cats. It is most frequently caused by an excessive concentration of circulating thyroxine-a thyroid hormone better known as T4-in the bloodstream.\n" +
            "What Are the Symptoms of Hyperthyroidism?\n" +
            "Weight loss and increased appetite are among the most common clinical signs of this condition. Weight loss is seen in 95 to 98 percent of hyperthyroid cats, and a hearty appetite in 67 to 81 percent. Excessive thirst, increased urination, hyperactivity, unkempt appearance, panting, diarrhea and increased shedding have also been reported. Vomiting is seen in about 50 percent of affected cats. Clinical signs are a result of the effect of increased T4 levels on various organ systems.\n" +
            "What Breeds/Ages Are Prone to Hyperthyroidism?\n" +
            "Hyperthyroidism can occur in any breed of cat, male or female, but occurs almost exclusively in older animals. Less than 6 percent of cases are younger than 10 years of age; the average age at onset is between 12 and 13 years.\n" +
            "How Is Hyperthyroidism Diagnosed?\n" +
            "Because several common diseases of older cats-diabetes, inflammatory bowel disease, intestinal cancer and chronic kidney failure-share some of the clinical signs of hyperthyroidism, a battery of tests is in order. A CBC, chemistry panel and urinalysis alone will not diagnose hyperthyroidism, but they can certainly rule out diabetes and kidney failure. Hyperthyroid cats may have normal findings on the CBC and urinalysis, but the chemistry panel often shows elevation of several liver enzymes.\n" +
            "In the vast majority of cases, a definitive diagnosis of hyperthyroidism is based on a simple blood test that shows elevated T4 levels in the bloodstream. Unfortunately, between 2 percent and 10 percent of cats with hyperthyroidism will have normal T4 levels. One possible explanation for this is that in mild cases, T4 levels can fluctuate in and out of the normal range. Another is that concurrent illness will suppress elevated T4 levels, lowering them into the normal or high-normal range and fooling the veterinarian into thinking that the cat’s thyroid status is normal. Because these are geriatric cats, concurrent illness is fairly common, and diagnosis of hyperthyroidism in these cats can be tricky.\n" +
            "How Is Hyperthyroidism Treated?\n" +
            "Several treatment options for hyperthyroidism exist, each with advantages and disadvantages.\n" +
            "•\tOral administration of antithyroid medication. Methimazole (brand name TapazoleTM) has long been the mainstay of drug therapy for feline hyperthyroidism. It is highly effective in correcting the condition, often within two to three weeks. Unfortunately, about 10%-15% of cats will suffer side effects, such as loss of appetite, vomiting, lethargy, and occasionally blood cell abnormalities. Rare but more serious side effects include severe facial itching with self-induced trauma, blood clotting disorders, or liver problems. Most side effects are mild and eventually resolve, although some necessitate discontinuation of the medication. Lifelong daily medication is required, which is a disadvantage to owners whose cats resist pilling. CBC and T4 levels need to be rechecked regularly for the remainder of the cat’s life.\n" +
            "•\tSurgical removal of the thyroid gland. Hyperthyroidism is usually caused by a benign tumorcalled a thyroid adenoma that involves one or, more often, both thyroid glands. Fortunately, most hyperthyroid cats have benign, well-encapsulated tumors that are easily removed. Surgery usually results in a palliation and not a cure, but anesthesia can be challenging in these older patients whose disease may have affected their hearts and other organs. Although surgery may seem costly, it often ends up being less expensive than years of oral medication and regular bloodwork rechecks.\n" +
            "•\tRadioactive iodine therapy. This is probably the safest and most effective treatment option. Radioactive iodine, given by injection, becomes concentrated in the thyroid gland, where it irradiates and destroys the hyperfunctioning tissue. No anesthesia or surgery is required, and only one treatment is usually needed to achieve a cure. It used to be that radioiodine treatment was performed only in specialized, licensed facilities, but many private treatment facilities are now found throughout the country. Hospitalization may be prolonged; depending on local or state ordinances, cats may need to be kept at the treatment facility for 10 to 14 days until the level of radioactivity in their urine and feces decreases to an acceptable level. Also, radioiodine therapy is costly. The price tag has come down from about $1,200 to between $500 and $800-but this is still prohibitive for many cat owners.\n";


    String cat_kidney="kidney";
    String cat_kidney_title="Cats with kidney problems have a reduced ability to excrete waste products into their urine, leading to a potentially toxic build-up in the bloodstream. While some kidney problems occur suddenly, chronic kidney disease shows up more slowly over a period of time. Timely veterinary assessment with ongoing supportive care and dietary management can allow some cats with kidney problems to maintain an adequate quality of life.\n" +
            "What Causes Kidney Problems?\n" +
            "The following are some causes of both chronic and acute kidney problems:\n" +
            "•\tHigh blood pressure \n" +
            "•\tInfection\n" +
            "•\tImmunological disease\n" +
            "•\tCongenital or hereditary disease\n" +
            "•\tCancer \n" +
            "•\tDecreased blood flow to kidneys\n" +
            "•\tKidney trauma\n" +
            "•\tUrinary obstructions such as kidney stones\n" +
            "•\tExposure to toxins, especially antifreeze\n" +
            "What Are Some Signs of Kidney Problems?\n" +
            "If your cat shows any of the following symptoms, please take her to see your veterinarian.\n" +
            "•\tAppetite loss/decrease\n" +
            "•\tWeight loss \n" +
            "•\tVomiting or diarrhea\n" +
            "•\tLethargy or depression\n" +
            "•\tDehydration \n" +
            "•\tChange in water consumption\n" +
            "•\tPain in the kidney area\n" +
            "•\tLitter box aversion\n" +
            "•\tMouth ulcers\n" +
            "•\tBad breath \n" +
            "•\tConstipation \n" +
            "•\tBloody or cloudy urine\n" +
            "•\tUrinating in abnormal places or pain when urinating\n" +
            "•\tStumbling, acting drunk\n" +
            "Which Cats Are Prone to Kidney Problems?\n" +
            "Kidney disease is most prevalent in older cats, but can occur in cats of any age. Cats can be born with abnormal kidneys that never function properly. Some breeds, like Persians, are predisposed to such hereditary kidney problems.\n" +
            "Additionally, outdoor cats run the risk of acute problems because they have more chance of exposure to toxins that can cause kidney failure, namely antifreeze.\n" +
            "How Are Kidney Problems in Cats Diagnosed?\n" +
            "There are various ways to determine if a cat has kidney disease. Your veterinarian will perform a physical examination and take blood and urine samples to see if there is a problem with your pet’s kidneys. Radiographs, ultrasound, blood pressure measurement or biopsy of the kidney may also be performed.\n" +
            "How Are Kidney Problems in Cats Treated?\n" +
            "It may be difficult to determine a specific cause of kidney disease. Emergency treatment and hospitalized care may be needed depending on the stage of kidney failure a cat is in. Acute kidney disease can sometimes be caught early on, when there is minimal damage to the kidneys. In some cases, long-term supportive treatment is beneficial. The following are possible treatments:\n" +
            "•\tTreatment of underlying cause of kidney failure (e.g. antifreeze toxicity, infection)\n" +
            "•\tDrugs to enhance urine production\n" +
            "•\tTherapeutic diet\n" +
            "•\tManagement of electrolyte abnormalities\n" +
            "•\tFluid therapy\n" +
            "•\tCorrection of anemia\n" +
            "•\tMedication for high blood pressure, vomiting or gastrointestinal problems\n" +
            "•\tDialysis\n" +
            "•\tKidney transplant\n" +
            "\n" +
            "Should Cats with Kidney Problems Be Fed a Special Diet?\n" +
            "Feeding your cat a special diet will not cure kidney disease, but managing your cat’s intake of protein, phosphorous and sodium can help diminish symptoms and add to your pet’s overall health and longevity. There are many commercially available veterinary diets for cats with chronic kidney disease.\n" +
            "Please remember, changes in your cat’s diet should not be made abruptly. Speak to your vet about gently transitioning your cat to a new food.\n" +
            "How Can I Care for my Cat at Home?\n" +
            "Be diligent with your cat’s eating regimen, keeping strictly to the diet your vet has prescribed. Always give her access to clean, fresh water, keep your home environment as calm as possible and make sure she has routine medical checkups and tests as advised by your vet.\n" +
            "How Can Kidney Problems Be Prevented?\n" +
            "Do not give your cat any over-the-counter medications without instruction by your veterinarian, and make sure she has access to fresh water at all times.\n" +
            "What Happens if a Cat's Kidney Problems Go Untreated?\n" +
            "If acute kidney failure is not recognized and treated, cats can suffer varying degrees of permanent kidney damage and even death. Chronic kidney failure causes many secondary problems over time, including a decrease in calcium levels that can lead to bone demineralization. Anemia may also occur as the kidneys lose the ability to produce a hormone that stimulates red blood cell production. Ultimately, if left untreated, kidney failure is fatal.\n";


    String cat_urin="urinary";
    String cat_urinary="Problems that affect a cat’s lower urinary system often prevent the bladder from emptying correctly or may even cause fatal blockage of the urethra, the tube connecting the bladder to the outside of the body. Very often the culprit is Feline Lower Urinary Tract Disease (FLUTD). Once called Feline Urologic Syndrome (FUS), FLUTD is not merely one problem, but a collection of clinical symptoms that may have more than one possible cause. Symptoms of FLUTD include frequent or painful urination, bloody urine and frequent licking of the urinary opening. One key to treating FLUTD is to determine the root cause, which may include bladder stones, urinary tract blockage, infection or cancer. If the cause of these symptoms cannot be determined, the cat is considered to have bladder inflammation (cystitis).\n" +
            "For upper urinary tract issues in cats, please see our article on Kidney Problems.\n" +
            "What Causes Lower Urinary Tract Problems in Cats?\n" +
            "•\tStones, crystals or debris accumulation in the bladder or urethra\n" +
            "•\tUrethral plug (accumulation of debris from urine)\n" +
            "•\tBladder inflammation or infection\n" +
            "•\tIncontinence from excessive water drinking or weak bladder\n" +
            "•\tInjury to, or tumor in, the urinary tract\n" +
            "•\tStress\n" +
            "•\tSpinal cord problems\n" +
            "•\tCongenital abnormality\n" +
            "What Health Conditions Might Lead to Lower Urinary Tract Problems?\n" +
            "Endocrine diseases such as hyperthyroidism and diabetes mellitus can cause lower urinary tract problems in cats.\n" +
            "Which Cats Are Prone to Lower Urinary Tract Problems?\n" +
            "FLUTD is rarely diagnosed in animals younger than one year; the average age is typically four years. Male cats are generally more prone to urethral blockages because of their narrower urethras.\n" +
            "How Can I Tell if My Cat Has Lower Urinary Tract Problems?\n" +
            "The following signs may indicate that your cat is having trouble with his urinary tract:\n" +
            "•\tInability to urinate or only passing a small amount of urine\n" +
            "•\tBloody or cloudy urine\n" +
            "•\tLoss of bladder control, dribbling urine\n" +
            "•\tIncreased frequency of urination or visits to the litter box\n" +
            "•\tStraining and/or crying out in pain when trying to pass urine\n" +
            "•\tProlonged squatting in litter box\n" +
            "•\tFear/avoidance of litter box and soiling in inappropriate places\n" +
            "•\tConstant licking of urinary opening\n" +
            "•\tStrong odor of ammonia in urine\n" +
            "•\tLethargy\n" +
            "•\tVomiting\n" +
            "•\tIncreased water consumption\n" +
            "•\tHard, distended abdomen\n" +
            "What Should I Do If I Think My Cat Has Lower Urinary Tract Problems?\n" +
            "Please see your veterinarian for immediate medical attention, especially if your cat is straining to urinate or crying out in pain. This could be a medical emergency!\n" +
            "How Are Lower Urinary Tract Problems Diagnosed?\n" +
            "To diagnose a lower urinary tract problem, your vet should conduct a complete physical exam, a urinalysis and possibly urine culture, blood work, radiographs or ultrasound.\n" +
            "How Are Lower Urinary Tract Problems Treated?\n" +
            "Because feline urinary problems are so varied and potentially serious in nature, your first step is to get immediate veterinary care. Depending on your cat’s prognosis, one of the following may be recommended:\n" +
            "•\tAntibiotics or other medications\n" +
            "•\tDietary changes\n" +
            "•\tIncrease in water intake\n" +
            "•\tUrinary acidifiers\n" +
            "•\tExpelling of small stones through urethra\n" +
            "•\tSurgery to either remove bladder stones or tumor, or to correct congenital abnormality\n" +
            "•\tUrinary catheter or surgery to remove urethral blockage in male cats\n" +
            "•\tFluid therapy\n" +
            "What Can Happen If a Cat's Lower urinary Tract Problems Go Untreated?\n" +
            "Untreated urinary problems can cause partial or complete obstruction of the urethra, preventing a cat from urinating. This is a medical emergency that can very quickly lead to kidney failure and/or rupture of the bladder, and can prove fatal if the obstruction is not relieved right away.\n";


    String cat_shedding="shedding";
    String cat_shedding_title="Shedding is a cat’s natural process of losing dead hair. Outdoor cats may lose more hair in the spring and fall and retain more fur in the winter, while indoor cats can shed all year round. Regularly grooming your cat and vacuuming hair from your house should minimize the inconvenience of shedding. However, if you see bald patches in your cat’s fur or notice a significant loss of hair, the underlying cause may be a health-related problem and should be investigated by a veterinarian.\n" +
            "What Would Make a Cat Shed Excessively?\n" +
            "A variety of medical, dietary and stress-related issues can cause your cat to lose more hair than is normal. If you notice he’s losing an excessive amount of hair or has bald patches, please consult your veterinarian immediately. Your cat may be suffering from one of the following health issues:\n" +
            "•\tAllergies \n" +
            "•\tRingworm \n" +
            "•\tBacterial infection \n" +
            "•\tFleas \n" +
            "•\tHormonal imbalance such as hyperthyroidism\n" +
            "•\tPoor diet \n" +
            "•\tStress\n" +
            "•\tCertain medications\n" +
            "•\tPregnancy or lactation\n" +
            "•\tSunburn\n" +
            "Continue Reading Below \n" +
            " \n" +
            "WebMD SUGGESTS \n" +
            "slideshow\n" +
            "Skin Problems in Cats Slideshow\n" +
            "start Continue Reading \n" +
            "When Is Shedding a Cause for Concern?\n" +
            "If your cat obsessively licks, bites or scratches, if he’s losing patches of hair or stops to scratch or bite the same few spots persistently, then it’s important you take him in for a veterinary exam. There may be a medical, dietary or stress-related issue that needs immediate attention.\n" +
            "How Can I Minimize My Cat's Shedding?\n" +
            "If your cat sheds a lot and your veterinarian has determined that there is no underlying medical cause, there are a few things you can do to minimize his hair loss:\n" +
            "•\tFeed him a healthy, balanced diet.\n" +
            "•\tGroom him regularly.\n" +
            "•\tExamine your cat’s skin and coat during your grooming sessions. Checking for hair loss, redness, bumps, cuts, fleas, ticks or other parasites will be a fast way to determine whether you need to go the vet to solve your pet’s shedding.\n" +
            "What Happens If Shedding goes Untended?\n" +
            "If your cat’s shedding is normal, the worst you may end up with is a hairy wardrobe and home-your cat, however, may suffer from hairballs if she isn’t groomed regularly. If her shedding is due to an underlying medical cause, including allergies, parasites, infections or disease, her health may continue to worsen if you don’t seek veterinary care. Additionally, cats who are not groomed appropriately can become matted-this is especially true for long-haired cats. Matted hair can be painful and lead to underlying skin problems.\n";


    String cat_vomit="vomit";
    String cat_vomit_title="You have probably seen your cat vomit from time to time without much concern. Vomiting can be a result of something minor, like a cat consuming his meal too quickly, or it can be a sign of a much more serious condition that requires immediate medical attention. Usually, a cat vomits because he ate something disagreeable, ate too much or played too soon after dinner. Vomiting can also be associated with gastrointestinal or systemic disorders.\n" +
            "Some causes for a sudden episode of vomiting, or acute vomiting, include:\n" +
            "•\tBacterial infection of the gastrointestinal tract\n" +
            "•\tDiet-related causes (diet change, food intolerance)\n" +
            "•\tGastric or intestinal foreign bodies (toys, hairballs)\n" +
            "•\tIntestinal parasite\n" +
            "•\tAcute kidney failure\n" +
            "•\tAcute liver failure or gall bladder inflammation\n" +
            "•\tPancreatitis\n" +
            "•\tPost-operative nausea\n" +
            "•\tToxins or chemicals\n" +
            "•\tViral infections\n" +
            "•\tCertain medications\n" +
            "What Should I Do If My Cat Vomits Frequently?\n" +
            "An occasional, isolated bout of vomiting is normal. However, frequent vomiting can be a sign of a more serious condition. Please bring your cat to the vet for a complete examination and diagnosis.\n" +
            "Some causes of chronic (ongoing) vomiting include:\n" +
            "•\tColitis\n" +
            "•\tGastritis\n" +
            "•\tPancreatitis\n" +
            "•\tDiaphragmatic hernia\n" +
            "•\tDiet related (food allergy or intolerance)\n" +
            "•\tForeign bodies\n" +
            "•\tGastrointestinal ulceration\n" +
            "•\tHeartworm infection\n" +
            "•\tIntestinal obstruction\n" +
            "•\tKidney failure\n" +
            "•\tLiver failure\n" +
            "•\tNeurological disorders\n" +
            "•\tParasites\n" +
            "•\tSevere constipation\n" +
            "•\tToxicity (such as lead)\n" +
            "•\tGastric or intestinal tumors\n" +
            "What Other Symptoms Should I Watch For?\n" +
            "The causes of vomiting are so varied that it can be difficult to diagnose, and so it’s important to consider the circumstances.\n" +
            "What to Watch For:\n" +
            "•\tFrequency of vomiting. If your cat vomits once and proceeds to eat regularly and have a normal bowel movement, the vomiting was most likely an isolated incident.\n" +
            "•\tDiarrhea\n" +
            "•\tDehydration \n" +
            "•\tLethargy\n" +
            "•\tBlood in vomit\n" +
            "•\tWeight loss \n" +
            "•\tChange in appetite and water intake\n" +
            "When Is It Time to See the Vet?\n" +
            "Please see your vet if you notice any of the symptoms mentioned above or if vomiting persists. Depending on your pet’s age, medical history, physical examination findings and your cat’s particular symptoms, your vet may choose to perform various tests (blood test, X-ray, sonogram, fecal examination) in order to make a diagnosis.\n" +
            "What Are Some Treatment Options?\n" +
            "The most common course of action is to withhold food and water until after vomiting has stopped for two hours. Afterward, water is introduced slowly, followed by a bland diet. You can baby your cat as you would a sick child and give homemade food such as boiled potatoes, rice or cooked, skinless chicken.\n" +
            "In certain situations your cat may require fluid therapy or antiemetics-drugs to help control vomiting. You’ll need to see your vet to determine the proper remedy.\n";


    String cat_resp="respiration";
    String cat_resp_title="A cat’s upper respiratory tract-the nose, throat and sinus area-is susceptible to infections caused by a variety of viruses and bacteria.\n" +
            "What Causes Upper Respiratory Infections in Cats?\n" +
            "By far, viruses are the most common causes of upper respiratory infections (URIs) in cats. Feline calicivirus and feline herpesvirus account for 80 to 90 percent of all contagious upper respiratory problems, and are prevalent in shelters, catteries and multi-cat households. These viruses can be transmitted from cat to cat through sneezing, coughing, or while grooming or sharing food and water bowls. Once infected, cats can become carriers for life, and though they may not show clinical signs, they can still transmit the viruses to others. Cats often develop bacterial infections secondary to these common viral infections.\n" +
            "There are also upper respiratory infections in cats that are primarily caused by bacteria. Chlamydia and Bordetella-also commonly found in shelters and areas with multiple cats-are two such bacterial infections. Less common in cats than dogs, Bordetella is usually associated with stress and overcrowded living conditions.\n" +
            "What Are the General Symptoms of Upper respiratory Infections?\n" +
            "Symptoms differ depending on the cause and location of the infection, but some common clinical signs of upper respiratory problems in cats include:\n" +
            "•\tSneezing\n" +
            "•\tCongestion\n" +
            "•\tRunny nose\n" +
            "•\tCough\n" +
            "•\tClear to colored nasal discharge\n" +
            "•\tGagging, drooling\n" +
            "•\tFever \n" +
            "•\tLoss of or decreased appetite\n" +
            "•\tNasal and oral ulcers\n" +
            "•\tSquinting or rubbing eyes\n" +
            "•\tDepression\n" +
            "Are Certain Cats Prone to Upper Respiratory Infections?\n" +
            "Age, vaccination status and physical condition all play a role in a cat’s susceptibility to upper respiratory infections, but cats who live in multi-cat households or shelters are most susceptible. Veterinarians have found that stress plays a role in causing outbreaks of URI, and cats in any shelter, cattery or boarding facility are generally experiencing high levels of stress. Cats who have recovered from URI can become carriers, and may experience recurrences when stressed.\n" +
            "Certain breeds like Persians and other flat-faced breeds have a predisposition to develop upper respiratory infections due to their facial structure.\n" +
            "What Should I Do If I Think My Cat Has an Upper Respiratory Infection?\n" +
            "It’s important to bring your cat to a veterinarian if you think she may be suffering from an upper respiratory infection. A brief exam by a veterinarian will help to determine if your cat requires medication, has a fever or is dehydrated. Avoid self-diagnosis, since your cat may be infectious and require isolation, antibiotics or additional veterinary care.\n" +
            "How Are Upper Respiratory Infections Treated in Cats?\n" +
            "Your veterinarian will prescribe the best course of treatment for your cat, which may include medications, isolation, rest and support with fluids and nutritional support.\n" +
            "What Happens If an Upper Respiratory Infection Is Left Untreated?\n" +
            "Left untreated, some upper respiratory infections can progress to pneumonia or have other serious complications, such as blindness or chronic breathing difficulties.\n" +
            "How Can I Prevent My Cat from Getting Upper Respiratory Infections?\n" +
            "•\tKeep your cat indoors to minimize the risk of exposure to infected animals.\n" +
            "•\tProperly isolate infected cats to protect other pets living in the same environment.\n" +
            "•\tMinimize stress.\n" +
            "•\tKeep your cat up to date on vaccines as recommended by your vet. Vaccines for upper respiratory disease in cats may not actually prevent infection, but they help lessen the severity of the disease in some cases.\n" +
            "•\tRegular veterinary exams and preventive care can help catch and treat problems early. A cat’s best defense against upper respiratory infection is a healthy immune system.\n" +
            "•\tPractice good hygiene and wash your hands thoroughly when handling multiple cats.\n";


    String cat_breed_bob="cat bobtail breed";
    String cat_breed_bobtail="While the breed is still developing, breeders say that Bobtails are playful, energetic, and friendly, and possess an uncanny intelligence for Houdini-type escapes from closed rooms and fastened cages. Very people-oriented, they are not above demanding human attention by meowing or commandeering available laps.\n" +
            "On the cat activity scale (with, perhaps, the Persian as a serene '1' and the Abyssinian as an animated '10'), the Bobtail rates a 7 or 8 ' fun-loving and frisky but not overactive. \n";

    String cat_breed_cur="cat curl breed";
    String cat_breed_curl="Curls have qualities other than the whimsical ears to make them attractive pets. They are people cats that do not show any of the stereotypical aloofness, and are affectionate without harassing people for attention the way some breeds can. They delight in perching on shoulders and love to pat and nuzzle their peoples' faces. Curls are a 'fetching' breed, easily taught to play fetch, and never lose their love of play. They are also noted for their affinity with children.\n" +
            "While not as active as the Abyssinian, American Curls are playful and energetic. They also display the typical cat curiosity and want to be right there to investigate any changes in their environment. \n";

    String cat_breed_short="cat short breed";
    String cat_breed_shorthair="When describing the American Shorthair, the expression 'happy medium' springs to mind. These all-American cats are medium in size, build, type, and temperament; neither too big nor small, not overly cuddly nor distant, neither couch potatoes nor hyperactive. Breeders note that the American Short-hair is the perfect breed for the person who wants a cat that enjoys being in your lap but not in your face. American Shorthairs are known for their quiet voices and adaptable personalities; they are sociable, easily trained, and adapt well to other animals and children. They generally do not like to be picked up; like their Pilgrim companions who left England to find independence, they cherish their freedom. \n" +
            "Because of the American Shorthair's history as a working cat, they make great companions in terms of health, strength, and vitality. With proper care Americans enjoy long life spans, generally between 15 and 20 years. \n";

    String getCat_breed_wirehair="cat wire breed";
    String cat_breed_wirehair="Wirehairs are people cats that crave human attention and affection. They are active without being hyper, and affectionate without being clingy. They exhibit a keen interest in their surroundings, want to be involved in every aspect of your day, and will follow you from room to room to keep an eye on proceedings. Fanciers say that they seem particularly in tune with their families' feelings and try to offer comfort and companionship when their chosen family member is feeling blue. That's when they turn on the purrs and sit beside them to offer their support.\n" +
            "As cats go, Wirehairs have a genuine sense of humor, and love to be the centers of attention. Agile and fun-loving, they enjoy playing the clown and are generally more playful and active than the American Shorthair. \n";

    String cat_breed_bali="cat balinese breed";
    String cat_breed_balinese="Balinese cats are smart, sweet, and fun to be around. Like the Siamese, they are known for their ability to communicate vocally, sometimes nonstop, and therefore this breed is not for everyone. Highly social, Balinese are sensitive to your moods and feelings and are more than willing to cheer you up with some happy chatter if you're feeling gloomy. \n" +
            "They are agile leapers and will often ride on their people's shoulders. They love to play and easily learn to fetch, bringing the ball or toy back for repeated throwing. They will keep you entertained with their antics, but possess a loving disposition as well. They can be quite assertive in their requests for attention, but also possess a special dignity particular to the Balinese and Siamese breeds. \n";

    String cat_breed_beng="cat bengal breed";
    String cat_breed_bengal="The Bengal may look like a wild cat, but breeders insist that the Bengal is as lovably friendly and docile as any full-blooded domestic cat. Fanciers describe Bengals as playful, gregarious, and energetic cats that have a generous dose of feline curiosity and that want to be involved with their family. Not intimidated by water, they will sometimes join their family for a swim, as long as it's on their terms.\n" +
            "Although show-quality cats must be four generations away (F4) from the leopard cat to be shown, previous generations of Bengals are placed as pets; therefore, it's important to know what you're getting when acquiring a Bengal. Before getting a second generation (F2) or third generation (F3) Bengal, be sure that the cat is free of temperament problems. \n";

    String cat_breed_bir="cat bir breed";
    String cat_breed_birman="Birmans are affectionate, gentle, and faithful companions with an air of dignity that seems to invite adoration by their human companions. As former temple cats, Birmans seem to have become accustomed to adoration. They are very intelligent and affectionate, according to fanciers, and very people-oriented. They will generally greet visitors with curiosity rather than fear.\n" +
            "Because of their gentle temperaments, Birmans are easy to handle, care for, and show, and they make ideal pets for anyone who wants quiet companions that will offer love and affection in return for just a little well-deserved worship. \n";

    String cat_breed_bom="cat bombay breed";
    String cat_breed_bombay="If an aloof, independent cat is what you're craving, this breed isn't for you. Bombays are attached to their family, and tend to love the entire family rather than bond with only one person. Fanciers say they are particularly good with children.\n" +
            "They want constant attention, although they are gentle and polite in their attempts to gain your notice. When you sit down, don't be surprised to find your Bombay sitting beside you moments later. Curious and intelligent, Bombays love to play, but are not as rambunctious as some breeds. Generally, they are not as vocal as the Oriental breeds.\n";

    String getCat_breed_brit="cat british breed";
    String cat_breed_british="If you're looking for a cat that will loot your refrigerator and swing dizzily from your chandeliers, then the British Shorthair is not for you. Brits are quiet, even-tempered, undemanding cats with a bit of typical British reserve, particularly when they're first introduced. When they get over their initial shyness, however, they become extremely faithful companions. British Shorthairs tend to show their loyalty to the entire family rather than select one person with whom to bond. British Shorthair breeders describe Brits as cats that like to keep a low profile, sweet and affectionate but not clingy 'in-your-face' type cats. They tend to be independent and if left on their own can usually adapt quite well. ";

    String cat_breed_burm="cat burmese breed";
    String cat_breed_burmese="Breeders and fanciers report that Burmese are amusing, playful, and super-smart, the perfect interactive cats for home, office, shop, any place where people are in need of love and entertainment. They are as active as the Siamese and love to play. Devoted cats, Burmese are loyal and people-oriented.\n" +
            "Breeders report temperament differences between males and females. The females are highly curious, active, and very emotionally involved with their family. The altered males love their humans too, but are more placid. They like to lounge about, usually on top of whatever you're doing. They take life as it comes. The only issue about which they are passionately concerned is the selected cuisine and when it will be served.\n" +
            "Burmese have a unique rasp to their voices and sound a bit like cats going hoarse from too much talking. Burmese are not as talkative as their Siamese neighbors. When they have something to say, however, they'll reiterate the message until you get out your universal feline/human translator and take care of whatever it is troubling them. \n";

//THE TEXT FOR DOG
    String puppy_intro="puppy";
    String puppy_intro_title="During the first few weeks of life, a puppy’s primary activities are feeding," +
            " keeping warm and developing social skills. In most cases, humans will simply " +
            " watch the mother dog provide all necessary care for her puppies. However, if" +
            " the puppy in your care has been separated from his mother, or if the mother " +
            " dog has rejected her young or cannot produce enough milk, caring for the pup " +
            " is up to you.";

    String puppy_feed="feed";
    String feed_puppy_title="A mother dog’s milk provides everything the pups need during their " +
            "first four weeks of life. If you are caring for an orphan or the mother is out of" +
            " the picture, consult with a veterinarian for guidance on the proper way to bottle-feed" +
            " newborns, as it is easy to cause harm by doing it incorrectly. The babies will need to" +
            " be fed a commercial canine milk replacer. Be sure to use one specifically formulated for" +
            " puppies, as cow’s milk and other milk replacer can cause diarrhea.\n" +
            "\n" +
            "Puppies will need bottle or syringe feeding every few hours for several weeks.\n" +
            "\n" +
            "Also, make sure orphaned puppies stay warm at this tender age -- a well-monitored" +
            " heating pad or warm water bottle wrapped in a towel will do the trick.";

    String puppy_eat="eat";
    String puppy_eat_title="Puppies generally nurse at least every two hours in their first week " +
            "of life. As they develop and grow, the intervals between feedings increase. At around " +
            "four weeks of age, puppies can begin to transition from nursing to eating solid food. " +
            "When making the transition to solid food, a high-quality dry puppy kibble can be soaked " +
            "with warm water and milk replacer and blended to the consistency of gruel. This can be" +
            " made available several times a day. Gradually, the amount of milk replacer can be decreased" +
            " until the puppies are eating dry kibble by about 7 to 8 weeks of age. Consult your veterinarian" +
            " for the exact amount to feed and for help creating a long-term feeding schedule suited to " +
            "the puppies’ development needs.\n";

    String puppy_weight="weight";
    String puppy_weight_title="The average birth weight for puppies depends on breed. During the first weeks" +
            " of life, a pup’s body weight may double or even triple. Gaining 10 to 15% of birth weight" +
            " daily is considered healthy. Pups who don’t gain adequate weight during this early period may not survive.";

    String feed_basis="basis";
    String feed_basis_title=" Dog food labels often provide some guidance on portion size, but your vet will know best how much food your dog needs to maintain a healthy weight, says veterinarian Louise Murray, DVM. She's vice president of the ASPCA's Bergh Memorial Animal Hospital in New York.\n" +
            "\n" +
            "\"Diet should be based on a dog's condition, and it should be very tailored to the dog,\" Murray says. \"Talk to your vet.\"\n" +
            "\n" +
            "Your vet can also recommend foods that may help protect your dog against disease, says veterinarian Chea Hall, DVM, of San Luis Obispo, Calif. Large dogs may be more likely than smaller dogs to develop arthritis, for instance. Proper nutrition may help protect your dog's joints and reduce the risk of arthritis.\n" +
            "Know Your Dog's Food\n" +
            "\n" +
            "Your vet can calculate how many calories your dog should get each day, but most dog food labels don't tell you how many calories the food provides.\n" +
            "\n" +
            "\"One cup could be 200 calories or it could be 400, and that's a huge difference,\" says Hall, who recommends a mostly dry food diet because dry is generally lower in calories than canned food.\n" +
            "\n" +
            "Hall's advice: Contact the food's maker for calorie and other nutritional information. You should also look for a statement on the package that says the food meets at least the minimum requirements for a healthy diet set by the Association of American Feed Control Officials (AAFCO) for your dog's life stage.";

    String feed_tips="tips";
    String feed_tips_title="The most important thing to keep in mind when feeding an adult dog is to make sure your dog eats a complete and balanced diet. Start by checking package labels for something called a statement of nutritional adequacy. It should say that the food meets nutrient profiles established by the Association of American Feed Control Officials (AAFCO) or that it has passed feeding trials designed to AAFCO standards.\n" +
            "\n" +
            "The statement also should say that the food is appropriate for adult maintenance or for all life stages. If your dog is overweight or inactive, stick with one labeled for adult maintenance. Food that’s appropriate for all life stages contains extra nutrients needed for growth.";

    String dog_bone="bone";
    String dog_bone_title="Just like we do, dogs love foodtreats. And just like us, dogs sometimes get too many calories from their treats.\n" +
            "\n" +
            "“If you’re not careful, treats can add a substantial amount of calories to your dog’s otherwise normal, healthy diet,” says Tami Pierce, DVM, clinical veterinarian at the University of California, Davis." +
            "You may not actually realize just how many treats your dog gets daily.\n" +
            "\n" +
            "“People will give their dog two, three and four treats at a time and not really think about it until they’re asked details about the dog’s health history and diet,” Pierce says.\n" +
            "\n" +
            "The 10% Rule\n" +
            "\n" +
            "Treats and snacks should only make up 10% of a dog’s daily calories. To get an idea of how many treats that is, ask your vet. They can make a recommendation based on the treats your dog likes, his weight, and how active he is.\n" +
            "\n" +
            "But dogs love treats. And people love giving their dog treats. It's a way to bond with your pet, and that's a good thing.\n" +
            "\n" +
            "You can still give your dog treats. Just give them one at a time.\n" +
            "Try Veggies and Fruit\n" +
            "\n" +
            "You can skip the store-bought snacks that are high in fat, sugar and often preservatives, and try offering your dog some vegetables.\n" +
            "\n" +
            "“Give them a baby carrot, a green bean, some broccoli,” Pierce says. “Those have virtually no calories, and dogs don’t care if you’re not giving them something meaty and fatty. They just want you to give them something.”\n" +
            "\n" +
            "Dogs are open to all foods, potentially. So vegetables can be a great snack option for your dog.\n" +
            "\n" +
            "Try fruits, too. Banana slices, berries, watermelon and apple slices, (with no seeds, of course). Steer clear of grapes, raisins, onions, chocolate and anything with caffeine. These can be toxic to dogs.\n" +
            "\n" +
            "Other snacks that can work well as low-calorie dog treats are air-popped popcorn with no salt or butter, and plain rice cakes broken into little pieces.\n" +
            "What to Avoid\n" +
            "\n" +
            "Your dog's treats should be easy on their teeth. Skip anything that's hard, like bones, antlers, or hooves.\n" +
            "1 | 2\n" +
            "Next Page >\n";


    String dog_vitamin="vitamin";
    String dog_vitamin_title="Many people take dietary supplements or vitamins. And increasingly, they’re likely to give them to their pets, too.\n" +
            "\n" +
            "As many as a third of U.S. dogs and cats may receive vitamins or supplements. The most common are multivitamins, supplements to support arthritic joints, and fatty acids to reduce shedding and improve a coat’s shine, according to a 2006 study published in the Journal of the American Veterinary Medical Association. Pet owners also may give probiotics to alleviate gastrointestinal problems or antioxidants to counteract the effects of aging, such as cognitive dysfunction.\n" +
            "\n" +
            "With a growing population of aging, overweight dogs, the market for dog supplements is expected to increase 37% by 2012, reaching $1.7 billion, according to Packaged Facts, a market research firm.\n" +
            "\n" +
            "Veterinary nutritionist Susan Wynn, DVM, sees many clients in her practice near Atlanta who give their dogs vitamins and nutritional supplements. “They come in with bags full sometimes,” she says.\n" +
            "\n" +
            "But do dogs need those vitamins and supplements? And are they even safe? Experts say some work, others don’t, and some aren’t necessary and may even be harmful to dogs.\n";

    String dog_eye="eyes";
    String dog_eye_title="Man’s best friend could use a good eyeballing once in awhile-believe us, your dog won’t take it personally! In fact, giving him regular home eye exams will help keep you alert to any tearing, cloudiness or inflammation that may indicate a health problem. Check out the following ways to help keep your dog’s vision sharp-and that twinkle in his eyes.\n" +
            "\n" +
            "1. The Initial Gaze\n" +
            "\n" +
            "Face your dog in a brightly lit area and look into his eyes. They should be clear and bright, and the area around the eyeball should be white. His pupils should be equal in size and there shouldn’t be tearing, discharge or any crust in the corners of his eyes.\n" +
            "2. A Closer Look\n" +
            "\n" +
            "With your thumb, gently roll down your dog’s lower eyelid and look at the lining. It should be pink, not red or white.\n" +
            "3. What to Watch Out For\n" +
            "\n" +
            "The following are signs that something may be wrong with one or both of your dog’s eyes:\n" +
            "\n" +
            "    Discharge & crusty gunk\n" +
            "    Tearing\n" +
            "    Red or white eyelid linings\n" +
            "    Tear-stained fur\n" +
            "    Closed eye(s)\n" +
            "    Cloudiness or change in eye color\n" +
            "    Visible third eyelid\n" +
            "    Unequal pupil sizes\n" +
            "\n" +
            "4. A Clean Sweep\n" +
            "\n" +
            "A gentle wipe with a damp cotton ball will help to keep your pooch’s eyes gunk-free. Wipe outward from the corner of the eye and be careful not to touch his eyeball-you don’t want to scratch the cornea. If your dog constantly suffers from runny eyes and discharge, please see your veterinarian. Your pet may have an infection.\n" +
            "5. Control the Eye-Fro\n" +
            "\n" +
            "Long-haired breeds can get eye damage if their locks aren’t tamed. Using scissors with rounded tips, carefully trim the hair around your dog’s eyes to keep his vision clear and prevent hairs from poking and scratching.\n" +
            "\n" +
            "Soaps and topical medications can be major irritants. Make sure to protect your dog’s eyes before bathing him or applying ointments or flea-control formulas.";

    String dog_ear_t="ear";
    String dog_ear_title="Although a dog’s ears need to be regularly monitored for his entire life, a little basic maintenance is generally all that’s required to keep them clean and healthy.\n" +
            "\n" +
            "Canine Anatomy\n" +
            "\n" +
            "Because of the twisty, curvy design of a dog’s inner ears, it’s easy for parasites, bacteria and yeast to hide and thrive in them. This also means that any debris in the canal must work its way up to escape. Infections can result from trapped debris. Dogs with allergies are particularly vulnerable, as are those with floppy ears, like Cocker spaniels, basset hounds and poodles.\n" +
            "Routine Care\n" +
            "\n" +
            "Your dog’s regular grooming/maintenance routine should include regular ear checks. This is especially important for dogs who produce excessive earwax or have a lot of inner-ear hair:\n" +
            "\n" +
            "    If your dog’s inner ears appear dirty, clean them with a cotton ball dampened with mineral oil, hydrogen peroxide or a solution formulated specifically for this purpose. Inner-ear skin is delicate, so allow your vet to demonstrate the proper method for cleaning your dog’s ears.\n" +
            "    Do not clean your dog’s ears so frequently or deeply as to cause irritation, and take care to NEVER insert anything into your dog’s ear canal.\n" +
            "    If your dog sprouts hair from his ear canal, you or your groomer may have to tweeze it out every few weeks to prevent problematic mats and tangles from forming. Please discuss with your vet whether this is necessary for your dog.\n" +
            "\n" +
            "Wet Behind the Ears?\n" +
            "\n" +
            "If you’re not careful, frequent bathing and swimming can lead to irritation and infection. To prevent this from happening, place cotton in your dog’s ears before baths, and be sure to dry her ears as thoroughly as you safely can after all water sports and activities.\n" +
            "\n" +
            "If your dog is prone to ear infections, you might want to pour a tiny amount of an ear drying solution made for dogs into her ear canals to help evaporate any water trapped inside. These ear washes, usually witch hazel-based, are available at better pet supply stores.";

    String dog_teeth="teeth";
    String dog_teeth_title="Give your dog regular home checks and follow the tips below, and you’ll have a very contented pooch with a dazzling smile.\n" +
            "\n" +
            "1. The Breath Test\n" +
            "\n" +
            "Sniff your dog’s breath. Not a field of lilies? That’s okay-normal doggie-breath isn’t particularly fresh-smelling. However, if his breath is especially offensive and is accompanied by a loss of appetite, vomiting or excessive drinking or urinating, it’s a good idea to take your pooch to the vet.\n" +
            "2. Lip Service\n" +
            "\n" +
            "Once a week, with your dog facing you, lift his lips and examine his gums and teeth. The gums should be pink, not white or red, and should show no signs of swelling. His teeth should be clean, without any brownish tartar.\n" +
            "3. Signs of Oral Disease\n" +
            "\n" +
            "The following are signs that your dog may have a problem in his mouth or gastrointestinal system and should be checked by a veterinarian:\n" +
            "\n" +
            "    Bad breath\n" +
            "    Excessive drooling\n" +
            "    Inflamed gums\n" +
            "    Tumors in the gums\n" +
            "    Cysts under the tongue\n" +
            "    Loose teeth\n" +
            "\n" +
            "4. The Lowdown on Tooth Decay\n" +
            "\n" +
            "Bacteria and plaque-forming foods can cause build-up on a dog’s teeth. This can harden into tartar, possibly causing gingivitis, receding gums and tooth loss. One solution? Regular teeth cleanings, of course.\n" +
            "5. Canine Tooth-Brushing Kit\n" +
            "\n" +
            "Get yourself a toothbrush made especially for canines or a clean piece of soft gauze to wrap around your finger. Ask your vet for toothpaste made especially for canines or make a paste out of baking soda and water. Please do not use human toothpaste, which can irritate a dog’s stomach.";

    String dog_breath="breath";
    String dog_breath_title="Bad breath is the result of a build-up of odor-producing bacteria in your dog’s mouth, lungs, or gut. Persistent bad breath can indicate that your dog needs better dental care or that something is wrong in his gastrointestinal tract, liver, or kidneys. In all cases, halitosis is a red flag that should be investigated.\n" +
            "\n" +
            "What Is Bad Breath Caused By?\n" +
            "\n" +
            "Most often, canine bad breath is caused by dental or gum disease, and certain dogs -- particularly small ones -- are especially prone to plaque and tartar. However, persistent bad breath can also indicate larger medical problems in the mouth, respiratory system, gastrointestinal tract, or internal organs.\n" +
            "How Can I Determine the Cause of My Dog’s Bad Breath?\n" +
            "\n" +
            "Your veterinarian is the best person to pinpoint the cause. A physical examination and laboratory work may be performed. Be ready to answer questions about your dog’s diet, oral hygiene, exercise habits, and general behavior.\n" +
            "When Is It Time To See the Vet?\n" +
            "\n" +
            "If your dog’s breath suddenly has an unusual smell, please consult your veterinarian. The following cases can signal medical problems that need immediate treatment.\n" +
            "\n" +
            "        Unusually sweet or fruity breath could indicate diabetes, particularly if your dog has been drinking and urinating more frequently than usual.\n" +
            "        Breath that smells like urine can be a sign of kidney disease.\n" +
            "        An unusually foul odor accompanied by vomiting, lack of appetite, and yellow-tinged corneas or gums could signal a liver problem.\n" +
            "\n" +
            " \n" +
            "How Is Bad Breath Treated?\n" +
            "\n" +
            "Treatment depends on your vet’s diagnosis. If plaque is the culprit, your dog might require a professional cleaning. If it’s an issue of diet, you might have to change your dog’s regular food. If the cause is gastrointestinal or an abnormality in your dog’s liver, kidneys, or lungs, please consult your vet about steps you should take.\n" +
            "How Can I Prevent My Dog From Having Bad Breath?\n" +
            "\n" +
            "Many people assume that bad breath in dogs, especially at a certain age, is a “given.” But that’s not the case. In fact, being proactive about your pup’s oral health will not only make your life together more pleasant, it’s smart preventive medicine.\n" +
            "\n" +
            "    Bring your dog in for regular checkups to make sure he has no underlying medical issues that may cause halitosis.\n" +
            "    Make sure your vet monitors and tracks the state of your dog’s teeth and breath.\n" +
            "    Feed your dog a high-quality, easy-to-digest food.\n" +
            "    Brush your dog’s teeth frequently -- every day is ideal. (Please be sure to use toothpaste formulated for dogs as human toothpaste can upset a canine’s stomach.)\n" +
            "    Provide hard, safe chew toys that allow your dog’s teeth to be cleaned by the natural process of chewing.\n" +
            "    Give your dog well-researched treats formulated to improve breath odor.\n" +
            "    Discuss home-use oral health products with your veterinarian to see if there’s a type he or she recommends.\n";

    String dog_toetail="toetail";
    String dog_toetail_title="Ever watched your dog roll on the ground, lick her coat or chew at a mat on her fur? These are her ways of keeping clean. Sometimes, though, she’ll need a little extra help from her friend to look her best.\n" +
            "\n" +
            "Make Grooming as Enjoyable as Possible-For the Both of You!\n" +
            "\n" +
            "Grooming sessions should always be fun, so be sure to schedule them when your dog’s relaxed, especially if she’s the excitable type. Until your pet is used to being groomed, keep the sessions short-just 5 to 10 minutes. Gradually lengthen the time until it becomes routine for your dog. You can help her get comfortable with being touched and handled by making a habit of petting every single part of your dog, including such potentially sensitive areas as the ears, tail, belly, back and feet.";

    String dog_arthrit="arthritis";
    String dog_arthritis="Dogs’ joints take a pounding, from running after tennis balls to jumping off the back deck. And for some dogs, that’s a problem. More use means more injuries and can lead to joint-related problems such as ACL (anterior cruciate ligament) tears and osteoarthritis." +
            "\n\nWhat causes osteoarthritis or joint problems in dogs?\n" +
            "\n" +
            "A: The two major categories of joint problems are developmental and degenerative problems. With developmental problems, you have things like hip or elbow dysplasia, where the joint does not develop correctly in a number of different ways.\n" +
            "\n" +
            "Degenerative problems cover a number of areas. But the most common, and the most common cause of arthritis in dogs, is cruciate ligament problems, where the ligament is degenerating over time and causing instability and secondary osteoarthritis." +
            "\n\nWhat are the signs of joint problems?\n" +
            "\n" +
            "A: Most of the time, people notice that their dogs are doing less or having more difficulty with common activities. The dog now has problems getting up on the couch, or going up the stairs, or getting in the back of the SUV. With more athletic dogs, maybe they can’t run as long with their owner, or they don’t want to play as long at the dog park.\n" +
            "\n" +
            "From there it progresses to overt lameness -- holding the limb up, or holding the limb funny. Those are the most common things we see. Rarely do we see overt pain as the first complaint. Usually it’s a slower process.\n" +
            "\n\n what advancements do you see coming that will help our dogs recover faster or heal more completely?\n" +
            "\n" +
            "A: Rehab is really taking off, and there are a lot of studies under way to determine the best protocols for different problems.\n" +
            "\n" +
            "The food companies are doing a lot of research on potential additives that can help with both inflammation and degradation or degeneration of joints.\n" +
            "\n" +
            "On the surgical side, we’re seeing a lot more minimally invasive procedures, such as the arthroscopic repairs and treatments and biological treatments, meaning different types of injections or replacements of tissues. We can grow a new joint replacement through tissue engineering now. Or we can take cartilage grafts from healthy cartilage, either from the same dog or from an organ donor dog.";

    String dog_diabet="diabetis";
    String dog_diabetis="Diabetes in dogs is a complex disease caused by either a lack of the hormone insulin or an inadequate response to insulin.\n" +
            "\n" +
            "After a dog eats, his digestive system breaks food into various components, including glucose-which is carried into his cells by insulin, a hormone secreted by the pancreas. When a dog does not produce insulin or cannot utilize it normally, his blood sugar levels elevate. The result is hyperglycemia, which, if left untreated, can cause many complicated health problems for a dog.\n" +
            "\n" +
            "It is important to understand, however, that diabetes is considered a manageable disorder-and many diabetic dogs can lead happy, healthy lives.\n" +
            "\n" +
            "What Type of Diabetes Do Most Dogs Get?\n" +
            "\n" +
            "Diabetes can be classified as either Type 1 (lack of insulin production) or Type II (impaired insulin production along with an inadequate response to the hormone.)\n" +
            "\n" +
            "The most common form of the disease in dogs is Type 1, insulin-dependent diabetes, which occurs when the pancreas is incapable of producing or secreting adequate levels of insulin. Dogs who have Type I require insulin therapy to survive. Type II diabetes is found in cats and is a lack of normal response to insulin.\n" +
            "What Are the Symptoms of Diabetes in Dogs?\n" +
            "\n" +
            "The following symptoms should be investigated as they could be indicators that your dog has diabetes:\n" +
            "\n" +
            "    Change in appetite\n" +
            "    Excessive thirst/increase in water consumption\n" +
            "    Weight loss\n" +
            "    Increased urination\n" +
            "    Unusually sweet-smelling or fruity breath\n" +
            "    Lethargy\n" +
            "    Dehydration\n" +
            "    Urinary tract infections\n" +
            "    Vomiting\n" +
            "    Cataract formation, blindness\n" +
            "    Chronic skin infections\n" +
            "\n" +
            " \n" +
            "What Causes Diabetes in Dogs?\n" +
            "\n" +
            "The exact cause of diabetes is unknown. However, autoimmune disease, genetics, obesity, chronic pancreatitis, certain medications and abnormal protein deposits in the pancreas can play a major role in the development of the disease.\n" +
            "Which Dogs Are Prone to Diabetes?\n" +
            "\n" +
            "It is thought that obese dogs and female dogs may run a greater risk of developing diabetes later in life (6-9 years of age). Some breeds may also run a greater risk, including Australian terriers, standard and miniature schnauzers, dachshunds, poodles, keeshonds and samoyeds. Juvenile diabetes can also be seen and is particularly prevalent in golden retrievers and keeshonds." +
            "\n\nWhat Should I Know About Treating My Diabetic Dog at Home?\n" +
            "\n" +
            "As your veterinarian will explain, it’s important to always give your dog insulin at the same time every day and feed him regular meals in conjunction with his medication. This allows increased nutrients in the blood to coincide with peak insulin levels, and will lessen the chance that his sugar levels will swing either too high or too low. You can work with your vet to create a feeding schedule around your pet’s medication time. It is also important to avoid feeding your diabetic dog treats that are high in glucose. Regular blood glucose checks are a critical part of monitoring and treating any diabetic patient, and your veterinarian will help you set up a schedule for checking your dog’s blood sugar.";

    String dog_diarrh="diarrhea";
    String dog_diarrhea="Diarrhea is characterized by frequent loose or liquid bowel movements. It can be caused by something as simple as a change in diet or a more serious illness or infection. Diarrhea may be sudden in onset and short in duration. It can also last for weeks to months or occur off and on. A single bout of diarrhea is generally not a cause for concern in dogs -- but if it persists for more than a day, it can lead to dehydration, or it may indicate an underlying health issue and should be checked out by a veterinarian.\n" +
            "\n" +
            "What Causes Diarrhea in Dogs?\n" +
            "\n" +
            "    Change in diet\n" +
            "    Food intolerance\n" +
            "    Ingestion of garbage or spoiled food\n" +
            "    Ingestion of poisonous substances or toxic plant material\n" +
            "    Ingestion of foreign body (for example, toy, rubber band, plastic bag, etc.)\n" +
            "    Allergic reaction\n" +
            "    Bacterial or viral infection\n" +
            "    Internal parasites, such as roundworms, coccidia and giardia\n" +
            "    Inflammatory bowel disease\n" +
            "    Kidney or liver disease\n" +
            "    Cancer or other tumors of the digestive tract\n" +
            "    Certain medications\n" +
            "    Colitis\n" +
            "    Stress\n" +
            "    Hemmorhagic gastroenteritis\n" +
            "\n" +
            "What Are the General Symptoms of Diarrhea?\n" +
            "\n" +
            "Loose or liquid, frequent stools are the most common symptoms of diarrhea in dogs. Other signs include flatulence, blood or mucus in stool, changes in volume of stool and straining to defecate. Lethargy, dehydration, fever, vomiting, decreased appetite, weight loss and an increased urgency to defecate may also accompany diarrhea." +
            "\n\nHow Do I Treat Diarrhea?\n" +
            "\n" +
            "It is often recommended that you avoid giving your dog any food for 12-24 hours while he’s experiencing diarrhea, but do provide plenty of fresh, clean water to stave off dehydration. Check with your veterinarian about the proper course of treatment for your dog’s specific case.";

    String dog_ear="ear";
    String dog_ear_infection="Canine ear infections are most commonly caused by bacteria or yeast. Ear mites, excessive hair, moisture or wax, foreign bodies, allergies, and hypothyroidism can all be contributing factors in the development of an ear infection. Because the ear canal in dogs is mostly vertical (unlike a human ear canal that is horizontal), it is easy for debris and moisture to be retained in the ear canal.\n" +
            "\n" +
            " \n" +
            "\n" +
            "How Can I Tell if My Dog Has an Ear Infection?\n" +
            "\n" +
            "The following symptoms may indicate that your dog needs to have his ears checked by a veterinarian:\n" +
            "\n" +
            "    Scratching of the ear or area around the ear\n" +
            "    Brown, yellow, or bloody discharge\n" +
            "    Odor in the ear\n" +
            "    Redness\n" +
            "    Swelling\n" +
            "    Crusts or scabs on inside of the outer ear\n" +
            "    Hair loss around the ear\n" +
            "    Rubbing of the ear and surrounding area on the floor or furniture\n" +
            "    Head shaking or head tilt\n" +
            "    Loss of balance\n" +
            "    Unusual eye movements\n" +
            "    Walking in circles\n" +
            "    Hearing loss\n" +
            "\n" +
            "Which Dogs Are Prone to Ear Infections?\n" +
            "\n" +
            "Dogs with allergies or those with non-erect outer ears can be predisposed to developing ear infections. Dogs that have excessive hair growth in the ear canal may also be more susceptible to ear infections.\n" +
            "How Are Ear Infections Diagnosed?\n" +
            "\n" +
            "A veterinarian can usually diagnose an ear infection by examining the ear canal and ear drum with a magnifying ear cone similar to devices used on people. This may require sedation, especially if the dog is very painful. A sample of ear discharge may be examined to look for bacteria, yeast, and parasites. If a bacterial infection is suspected your veterinarian may send a sample of the ear discharge to a laboratory to see what bacteria is causing the infection. Other diagnostics may be done (such as checking for an underactive thyroid) if your veterinarian feels they are indicated.\n" +
            "\n" +
            "Because there are multiple causes and contributing factors that cause ear infections in dogs, it is important that an accurate diagnosis is obtained by your veterinarian.\n" +
            "How Are Ear Infections Treated?\n" +
            "\n" +
            "Most commonly, ear infections can be treated with a professional cleaning followed by medication given at home. Your veterinarian may prescribe topical and/or oral medicine. It is not uncommon for some dogs to have recurrent ear infections.";

    String dog_eye_infect="eye infection";
    String dog_eye_infection=" What causes tear stains under a dog’s eyes?\n" +
            "\n" +
            "Excessive tearing can occur as a result of irritation to your dog’s eyes or because your dog’s tears are not draining properly.\n" +
            "\n" +
            "Just as your eye waters if a speck of dust blows into it, dogs’ eyes will make tears when irritated to flush away anything harmful. When the eyes are continually irritated, this can lead to chronic tearing that produces stains. Conditions that might irritate the eye include dog eye infections, glaucoma, and eyelash or eyelid problems.\n" +
            "\n" +
            "In a normal dog eye, there are small holes that drain tears away from the eye and down the throat. A variety of dog eye problems can affect this drainage, causing excessively watery eyes. These conditions include:\n" +
            "\n" +
            "    Shallow eye sockets. If the eye sockets aren’t big or deep enough, tears can spill out onto the fur around the eyes.\n" +
            "    Eyelids that are turned inward. If the eyelids roll in toward the eyeball, the drainage holes for tears (called puncta) may become blocked.\n" +
            "    Hair growth around the eye. If hair grows too close to the eye, it can wick tears away from the eye and onto the face.\n" +
            "    Blocked tear drainage holes (puncta). Previous dog eye infections or eye damage can cause scar tissue to form that blocks some of the drainage passages for tears.\n" +
            "\n" +
            " \n" +
            "2. Which types or breeds of dogs are more susceptible to dog eye discharge and tear stains?\n" +
            "\n" +
            "Regardless of breed, white dogs are more likely to have visible tear staining on their faces, because the pigments in their tears can easily dye light-colored fur. Also, dogs with long hair on their faces may be more prone to excessive tearing.\n" +
            "\n" +
            "Short-nosed dog breeds, such as Shih-tzu, Pekingese, Maltese, and pug, are prone to excessive tearing because they often have shallow eye sockets or hair growth in skin folds around the eyes that cause problems. Also, cocker spaniels and poodles are more likely than other breeds to have blocked tear ducts." +
            "\n\n3. Can the dog eye problems that cause tear stains be treated?\n" +
            "\n" +
            "It depends on the condition leading to excessive tearing. There is no way to stop dog eye discharge because of shallow eye sockets, so the goal in this situation is to minimize skin irritation and coat discoloration.\n" +
            "\n" +
            "If your dog’s tear stains are developing because his eyes are always irritated, eliminating the source of irritation will help. This might include keeping hair near the eyes trimmed very short and treating infection or glaucoma, if present.\n" +
            "\n" +
            "There are surgical options for certain eyelid or eyelash problems that can restore normal tear drainage and eliminate overflow onto the face.\n" +
            "\n" +
            "4. What can I do to get rid of my dog’s tear stains?\n" +
            "\n" +
            "Although those reddish-brown stains can be stubborn, there are certain remedies that may minimize their appearance. These include:\n" +
            "\n" +
            "    Antibiotics . Antibiotics such as tetracycline are sometimes used to address tear staining, as they reduce or eliminate the likelihood that tear stains will form. There are concerns about the use of antibiotics for this purpose on an ongoing basis, however, because it could lead to the development of drug-resistant bacteria, which would be far more dangerous to your pup than a few unsightly stains.\n" +
            "    Whitening products. Swabbing the stains with hydrogen peroxide or using special grooming products designed for pet fur may help with tear stains.\n" +
            "    Regular washing of your dog’s face.\n";

    String dog_hot="hot spot";
    String dog_hot_spot="Hot spots, also known as acute moist dermatitis, are red, moist, hot and irritated lesions that are typically found on a dog’s head, hip or chest area. Hot spots often grow at an alarming rate within a short period of time because dogs tend to lick, chew and scratch the affected areas, further irritating the skin. Hot spots can become quite painful.\n" +
            "\n" +
            "Why Do Hot Spots Occur?\n" +
            "\n" +
            "Anything that irritates the skin and causes a dog to scratch or lick himself can start a hot spot. Hot spots can be caused by allergic reactions, insect, mite or flea bites, poor grooming, underlying ear or skin infections and constant licking and chewing prompted by stress or boredom.\n" +
            "Which Dogs Are Prone to Developing Hot Spots?\n" +
            "\n" +
            "Dogs who are not groomed regularly and have matted, dirty coats can be prone to developing hot spots, as can dogs who swim or who are exposed to rain. Additionally, dogs with hip dysplasia or anal sac disease can start licking the skin on their hind end. Thick-coated, longhaired breeds are most commonly affected." +
            "\n\nHow Are Hot Spots Treated?\n" +
            "\n" +
            "First, your vet will attempt to determine the cause of hot spots. Whether it is a flea allergy, an anal gland infection or stress, the underlying issue needs to be taken care of. Treatment may also include the following:\n" +
            "\n" +
            "         Shaving of the hair surrounding the lesion, which allows air and medication to reach the wound\n" +
            "         Cleansing the hot spot with a non-irritating solution\n" +
            "         Antibiotics and painkillers\n" +
            "         Medication to prevent and treat parasites\n" +
            "         E-collar or other means to prevent self-trauma as the area heals     Balanced diet to help maintain healthy skin and coat\n" +
            "         Dietary supplement containing essential fatty acids\n" +
            "         Corticosteroids or antihistamines to control itching\n" +
            "         Hypoallergenic diet for food allergies\n" +
            "\n" +
            " \n" +
            "How Can I Help Prevent Hot Spots?\n" +
            "\n" +
            "The following tips may aid in the prevention of hot spots:\n" +
            "\n" +
            "         Make sure your dog is groomed on a regular basis.\n" +
            "         You may also want to keep your pet’s hair clipped short, especially during warmer months.\n" +
            "         Follow a strict flea control program as recommended by your veterinarian.\n" +
            "         Maintain as stress-free an environment for your pet as possible.\n" +
            "         To keep boredom and stress at bay, make sure your dog gets adequate exercise and opportunities for play and interaction with his human family and, if he enjoys it, with other dogs.\n";

    String dog_lower="lower urinary";
    String dog_lower_urinary="There are many problems that can affect a dog’s lower urinary system. Incontinence, bladder stones or crystals in the urine, bacterial infections, cancer, trauma or even obstruction of the urethra, the tube that allows urine to pass from the bladder to the outside of the body, can occur.\n" +
            "\n" +
            "What Causes Lower Urinary Tract Problems in Dogs?\n" +
            "\n" +
            "    Stones, crystals or debris accumulation in the bladder or urethra\n" +
            "    Bladder inflammation or infection\n" +
            "    Incontinence from excessive water drinking or weak bladder/hormonal issue\n" +
            "    Trauma\n" +
            "    Cancer\n" +
            "    Stress\n" +
            "    Spinal cord abnormalities\n" +
            "    Congenital abnormality\n" +
            "    Prostate disease\n" +
            "\n" +
            "What Health Conditions Might Lead to Lower Urinary Tract Problems?\n" +
            "\n" +
            "The most common lower urinary tract disease in dogs over seven years of age is incontinence related to a weak urinary sphincter muscle, allowing urine to “leak” out. Bacterial infections are also common. Endocrine diseases such as adrenal disease and diabetes mellitus can predispose dogs to bacterial infection of the lower urinary tract.\n" +
            "Which Dogs Are Prone to Lower Urinary Tract Problems?\n" +
            "\n" +
            "Older female dogs and dogs with diabetes are especially prone to urinary tract problems. There are different types of bladder stones that have a tendency to form under different conditions-some in older dogs, some in either males or females, and some in specific breeds under certain circumstances.\n" +
            "How Can I Tell if My Dog Has Urniary Tract Problems?\n" +
            "\n" +
            "    The following signs may indicate that your dog is having trouble with his urinary tract:\n" +
            "    Inability to urinate or only passing a small amount of urine\n" +
            "    Bloody or cloudy urine\n" +
            "    Fever\n" +
            "    Loss of bladder control, dribbling urine\n" +
            "    Increased amount and/or frequency of urination\n" +
            "    Straining and/or crying out in pain when trying to pass urine\n" +
            "    Soiling in inappropriate places\n" +
            "    Constant licking of urinary opening\n" +
            "    Strong odor to the urine\n" +
            "    Lethargy\n" +
            "    Vomiting\n" +
            "    Changes in appetite\n" +
            "    Weight loss\n" +
            "    Severe back pain\n" +
            "    Increased water consumption\n" +
            "\n" +
            "What Should I Do If I Think My Dog Has Lower Urinary Tract Problems?\n" +
            "\n" +
            "Please see your veterinarian for immediate medical attention, especially if your dog is straining to urinate or crying out in pain. This could be a medical emergency!" +
            "\n\nHow Are Lower Urinary Tract Problems Treated? \n" +
            "\n" +
            "Because canine urinary problems are so varied and potentially serious in nature, your first step is to get immediate veterinary care for your pet. Depending on your dog’s diagnosis, one of the following may be recommended:\n" +
            "\n" +
            "    Antibiotics\n" +
            "    Medications or supplements\n" +
            "    Dietary changes\n" +
            "    Increase in water intake\n" +
            "    Urinary acidifiers or alkalinizers\n" +
            "    Intravenous or subcutaneous fluid therapy\n" +
            "    Surgery or other procedures to remove bladder stones or tumor\n" +
            "    Surgery to correct congenital abnormality\n" +
            "    Treatment of underlying condition that is contributing to urinary problem (e.g. diabetes mellitus)\n" +
            "\n" +
            "What Can Happen If a Dog’s Lower Urinary Tract Problems Go Untreated?\n" +
            "\n" +
            "Untreated lower urinary problems can lead to serious medical problems in addition to causing discomfort for your pet. Bladder infections can move to the kidneys and cause life-threatening infections. Stones can cause partial or complete obstruction of the urethra, preventing a dog from urinating. This medical emergency can lead to kidney failure and/or rupture of the bladder, and can prove fatal if the obstruction is not relieved right away. ";

    String dog_obsessive="obsessive";
    String dog_obsessive_lick="Compulsive scratching, licking, and chewing behaviors are quite common in dogs and have a variety of causes. They can also be harmful. One of the first signs your dog has a problem might be the development of a “hot spot” -- a red, wet, irritated area that arises from persistent chewing, licking, scratching or rubbing. Although hot spots, or \"acute moist dermatitis,\" can occur anywhere on your dog’s body, they are most often found on the head, chest, or hips. Because dogs often incessantly scratch, lick, or bite at an area once it becomes irritated, hot spots can become large and incredibly sore rather quickly." +
            "\n\nReasons Why Dogs Compulsively Scratch, Lick, or Chew\n" +
            "\n" +
            "Dogs scratch, lick, or chew for a wide variety of reasons, ranging from allergies to boredom to parasite infestation:\n" +
            "\n" +
            "    Allergies. When dog scratching gets out of hand, it is often the result of allergies to food or environmental triggers, including mold and pollen. Dogs may also develop a skinirritationcalled contact dermatitis when they encounter substances like pesticides or soap.\n" +
            "    Boredom or anxiety . Just as people with anxiety might bite their nails or twirl their hair, dogs can have physical responses to psychological upset, too. In fact, some dogs develop a condition akin to human obsessive-compulsive disorder. It can manifest itself in scratching, licking, or chewing behaviors that can cause severe damage.\n" +
            "    Dry skin. A variety of factors, including winter weather and fatty acid deficiencies, can cause dry skin in dogs. Your pet may respond to the discomfort by scratching or licking at her skin or fur.\n" +
            "    Hormonal imbalances. If your dog’s body is not producing enough thyroid hormone or putting out too much cortisol, superficial skin infections can occur. You may notice small, red spots and your dog may scratch or lick as if bothered by allergies.\n" +
            "    Pain. When trying to determine why your dog is licking or chewing excessively, be sure to consider the possibility that something is making him physically uncomfortable. For instance, if you notice your dog biting his paw repeatedly, he could have a thorn or sharp stone stuck in his foot pad. Compulsive chewing or licking can also be a response to orthopedic problems, including arthritis and hip dysplasia.\n" +
            "    Parasites. Among the most common causes for compulsive dog licking, chewing, or scratching behaviors are fleas, ticks, and mites. Although ticks are often visible to the naked eye, fleas often go unseen until there is a large infestation, and mites are microscopic. So don’t assume that your dog isn’t suffering from parasites just because you can’t see them.\n" +
            "\nTreatment for Your Dog’s Compulsive Scratching, Licking, and Chewing\n" +
            "\n" +
            "Because there are so many reasons why dogs chew or scratch, be sure to check with your veterinarian as soon as you notice a problem. The veterinarian will help figure out the cause of the behavior and determine the best treatment plan. Depending on the cause of your dog’s compulsive behavior, this might include:\n" +
            "\n" +
            "    Eliminating parasites. There are a variety of flea and tick products that your veterinarian can recommend. Additionally, if your dog’s biting or chewing problems are caused by fleas, be sure to wash your dog’s bed and vacuum your carpeting and upholstered furniture on a regular basis to reduce the likelihood of reinfestation. You also need to treat any other animals in the household.\n" +
            "    Changing foods. If food allergies are making your dog itch, eliminating potential trigger foods (such as beef or wheat) can make a huge difference. Your vet may recommend a special diet if this appears to be the case. The addition of fatty acid supplements to your pet’s regular food can also help address dry skin issues and keep your dog’s coat healthy.\n" +
            "    Using medication. Your veterinarian may prescribe medications to treat underlying problems contributing to your dog’s persistent scratching. Additionally, your vet may recommend the use of topical or systemic antibiotics, steroids, or anti-itch products to treat existing hot spots or skin infections.\n" +
            "    Preventing the behavior. Because compulsive behaviors can cause serious damage and affect your dog’s quality of life, it’s important to do your best to stop your dog from chewing, licking, or scratching too much. Some ideas include using bitter sprays to discourage licking, having your dog wear a special collar to prevent access to hot spots, or keeping your dog close by your side when you’re home.\n" +
            "    Addressing anxiety or boredom. In some cases, compulsive biting, chewing, or licking develops in response to fear, stress, or inadequate stimulation. To reduce this likelihood, be sure your dog receives enough exercise, attention, and love. It can also be helpful to train your dog to chew on toys or bones to relieve stress as a replacement for inappropriate chewing or licking behaviors.\n";


    String dog_vomit="vomit";
    String dog_vomiting="A dog may vomit simply because he’s eaten something disagreeable or gobbled down too much food, too fast. But vomiting can also indicate something far more serious-your dog may have swallowed a toxic substance, or may be suffering from a condition that requires immediate medical attention. Vomiting can also be associated with gastrointestinal and systemic disorders that should be evaluated by a veterinarian.\n" +
            "\n" +
            "What Might Cause a Sudden. or Acute, Episode of Vomiting?\n" +
            "\n" +
            "    Bacterial infection of the gastrointestinal tract\n" +
            "    Diet-related causes (diet change, food intolerance, ingestion of garbage)\n" +
            "    Foreign bodies (i.e. toys, bones, pieces of chewies) in the gastrointestinal tract\n" +
            "    Intestinal parasites\n" +
            "    Acute kidney failure\n" +
            "    Acute liver failure or gall bladder inflammation\n" +
            "    Pancreatitis\n" +
            "    Post-operative nausea\n" +
            "    Ingestion of toxic substances\n" +
            "    Viral infections\n" +
            "    Certain medications or anesthetic agents\n" +
            "    Bloat\n" +
            "    Heatstroke\n" +
            "    Car sickness\n" +
            "    Infected uterus\n" +
            "\n" +
            "Vomiting that occurs sporadically or irregularly over a longer period of time can be due to stomach or intestinal inflammation, severe constipation, cancer, kidney dysfunction, liver disease or systemic illness.\n" +
            "What Should I Do If My Dog Vomits Frequently?\n" +
            "\n" +
            "An occasional, isolated bout of vomiting may not be of concern. However, frequent or chronic vomiting can be a sign of a more serious condition, such as colitis, intestinal obstruction or parvovirus. If your dog’s vomiting is not an isolated incident, please bring him to the vet right away for a complete examination and diagnostic testing.\n" +
            "What Other Symptoms Should I Watch For?\n" +
            "\n" +
            "The causes of vomiting are so varied that sometimes obtaining a diagnosis can be difficult, so it’s important to give your veterinarian as much information as possible and indicate if other signs are also occurring. What to watch for:\n" +
            "\n" +
            "    Frequency of vomiting. If your dog vomits once and proceeds to eat regularly and have a normal bowel movement, the vomiting was most likely an isolated incident.\n" +
            "    Diarrhea\n" +
            "    Dehydration\n" +
            "    Lethargy\n" +
            "    Blood in vomit\n" +
            "    Weight loss\n" +
            "    Change in appetite\n" +
            "    Increase or decrease in thirst or urination\n" +
            "\n" +
            " \n" +
            "When Is It Time to See the Vet?\n" +
            "\n" +
            "Please see your vet if you notice any of the symptoms mentioned above, if your dog vomits more than once during the course of a day, or if vomiting persists past one day." +
            "\n\nWhat Are Some Treatment Options?\n" +
            "\n" +
            "You can baby your dog as you would a sick child and give him homemade food such as boiled potatoes, rice and well-cooked, skinless chicken. In certain situations, your dog may require fluid therapy, antibiotics, a change in diet, antiemetics (drugs to help control vomiting) or other medication. It is best to follow your veterinarian’s recommendations regarding appropriate treatment. ";


    String dog_breed_Labra="labrador";
    String dog_breed_Labrador="The Labrador Retriever is a strongly built, medium-sized, short-coupled, dog possessing a sound, athletic, well-balanced conformation that enables it to function as a retrieving gun dog; the substance and soundness to hunt waterfowl or upland game for long hours under difficult conditions; the character and quality to win in the show ring; and the temperament to be a family companion. Physical features and mental characteristics should denote a dog bred to perform as an efficient Retriever of game with a stable temperament suitable for a variety of pursuits beyond the hunting environment.\n" +
            "The most distinguishing characteristics of the Labrador Retriever are its short, dense, weather resistant coat; an \"otter\" tail; a clean-cut head with broad back skull and moderate stop; powerful jaws; and its \"kind,\" friendly eyes, expressing character, intelligence and good temperament.\n";

    String dog_breed_gold="golden";
    String dog_breed_Golden="A symmetrical, powerful, active dog, sound and well put together, not clumsy nor long in the leg, displaying a kindly expression and possessing a personality that is eager, alert and self-confident. Primarily a hunting dog, he should be shown in hard working condition. Overall appearance, balance, gait and purpose to be given more emphasis than any of his component parts. Faults-Any departure from the described ideal shall be considered faulty to the degree to which it interferes with the breed's purpose or is contrary to breed character.";

    String dog_breed_germ="german";
    String dog_breed_german="The first impression of a good German Shepherd Dog is that of a strong, agile, well muscled animal, alert and full of life. It is well balanced, with harmonious development of the forequarter and hindquarter. The dog is longer than tall, deep-bodied, and presents an outline of smooth curves rather than angles. It looks substantial and not spindly, giving the impression, both at rest and in motion, of muscular fitness and nimbleness without any look of clumsiness or soft living. The ideal dog is stamped with a look of quality and nobility - difficult to define, but unmistakable when present. Secondary sex characteristics are strongly marked, and every animal gives a definite impression of masculinity or femininity, according to its sex.";

    String dog_breed_bull="bulldog";
    String dog_breed_bulldog="The perfect Bulldog must be of medium size and smooth coat; with heavy, thick-set, low-swung body, massive short-faced head, wide shoulders and sturdy limbs. The general appearance and attitude should suggest great stability, vigor and strength. The disposition should be equable and kind, resolute and courageous (not vicious or aggressive), and demeanor should be pacific and dignified. These attributes should be countenanced by the expression and behavior.";

    String dog_breed_york="yorkshire";
    String dog_breed_yorkshire="That of a long-haired toy terrier whose blue and tan coat is parted on the face and from the base of the skull to the end of the tail and hangs evenly and quite straight down each side of body. The body is neat, compact and well proportioned. The dog's high head carriage and confident manner should give the appearance of vigor and self-importance.";

    String dog_breed_pood="poodle";
    String dog_breed_poodle="That of a very active, intelligent and elegant-appearing dog, squarely built, well proportioned, moving soundly and carrying himself proudly. Properly clipped in the traditional fashion and carefully groomed, the Poodle has about him an air of distinction and dignity peculiar to himself.";

    String dog_breed_beag="beagle";
    String dog_breed_beagle="A miniature Foxhound, solid and big for his inches, with the wear-and-tear look of the hound that can last in the chase and follow his quarry to the death.";

    String dog_breed_fren="french";
    String dog_breed_french="The French Bulldog has the appearance of an active, intelligent, muscular dog of heavy bone, smooth coat, compactly built, and of medium or small structure. Expression alert, curious, and interested. Any alteration other than removal of dewclaws is considered mutilation and is a disqualification. Proportion and Symmetry - All points are well distributed and bear good relation one to the other; no feature being in such prominence from either excess or lack of quality that the animal appears poorly proportioned.";

    String dog_breed_dach="dachshund";
    String dog_breed_dachshund="Low to ground, long in body and short of leg, with robust muscular development; the skin is elastic and pliable without excessive wrinkling. Appearing neither crippled, awkward, nor cramped in his capacity for movement, the Dachshund is well-balanced with bold and confident head carriage and intelligent, alert facial expression. His hunting spirit, good nose, loud tongue and distinctive build make him well-suited for below-ground work and for beating the bush. His keen nose gives him an advantage over most other breeds for trailing.";

    String dog_breed_box="boxer";
    String dog_breed_boxer="The ideal Boxer is a medium-sized, square-built dog of good substance with short back, strong limbs, and short, tight-fitting coat. His well-developed muscles are clean, hard, and appear smooth under taut skin. His movements denote energy. The gait is firm yet elastic, the stride free and ground-covering, the carriage proud. Developed to serve as guard, working, and companion dog, he combines strength and agility with elegance and style. His expression is alert and his temperament steadfast and tractable.\n" +
            "The chiseled head imparts to the Boxer a unique individual stamp. It must be in correct proportion to the body. The broad, blunt muzzle is the distinctive feature, and great value is placed upon its being of proper form and balance with the skull.\n";





}
