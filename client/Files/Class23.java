

import java.io.PrintStream;
import sign.signlink;

public class Class23
{

    public static void method264(int i, Class44 class44)
    {
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("spotanim.dat", null), 891);
        if(i != 0)
        {
            aBoolean401 = !aBoolean401;
        }
        int newSpotAnimCount = 7;//12 aaaaaaaaagrapa
        /* Yarnova: Raise this by one every time you add a new GFX */

        anInt402 = class30_sub2_sub2.method410() + newSpotAnimCount;
        if(aClass23Array403 == null)
        {
            aClass23Array403 = new Class23[anInt402];
        }
        for(int j = 0; j < anInt402; j++)
        {
            if(aClass23Array403[j] == null)
            {
                aClass23Array403[j] = new Class23();
            }
            aClass23Array403[j].anInt404 = j;
            int originalDataID = -1;
            Class23 gfx = aClass23Array403[j];
            switch(j)
            {
case 601: // This is the GFX ID
originalDataID = 7;
gfx.anInt405 = 3008;
break;

			case 643: // This is the GFX ID
originalDataID = 7;
gfx.anInt405 = 2391; // This is the Model ID! (Original was 26391)
break;
case 644: // This is the GFX ID change to w/e
originalDataID = 282; //This is the original ID
gfx.anInt405 = 8223; //This is the new Id
break;
case 654: // This is the GFX ID change to w/e
originalDataID = 282; //This is the original ID
gfx.anInt405 = 8211; //This is the new Id
break;
case 605: // Desired Gfx Id
     originalDataID = 282; // Makes it so the gfx doesn't move, this is the animation id, change to what you would like it to move like.
     gfx.anInt405 = 10991; // Model Id of Humidify
     break;
case 648: // This is the GFX ID change to open thing
originalDataID = 282; //This is the original ID
gfx.anInt405 = 8203; //This is the new Id
break;
case 655: // This is the GFX ID for armadyl spec
originalDataID = 282; //This is the original ID
gfx.anInt405 = 2849; //This is the new Id
break;


case 656: // This is the GFX ID for SS change if you want
originalDataID = 282; //This is the original ID
gfx.anInt405 = 10500; //This is the new Id
break;

		case 613: // This is the GFX ID
			originalDataID = 2;
			gfx.anInt405 = 10116;
			break;

case 642: /* gfx ID veng */
originalDataID = 354; // you can change this , this id makes it spin ;)
gfx.anInt405 = 1828; /* Model ID 16828*/
break;


case 657: // This is the GFX ID
			originalDataID = 354;
			gfx.anInt405 = 12411;
			break;

		case 611: // This is the GFX ID
			originalDataID = 2;
			gfx.anInt405 = 10113;
			break;
                default:
                    originalDataID = -1;
                    break;
            }
            if(originalDataID != -1)
            {
                gfx.anInt406 = aClass23Array403[originalDataID].anInt406;
                if(Class20.aClass20Array351 != null)
                {
                    gfx.aClass20_407 = Class20.aClass20Array351[gfx.anInt406];
                }
                gfx.anInt410 = aClass23Array403[originalDataID].anInt410;
                gfx.anInt411 = aClass23Array403[originalDataID].anInt411;
                gfx.anInt412 = aClass23Array403[originalDataID].anInt412;
                gfx.anInt413 = aClass23Array403[originalDataID].anInt413;
                gfx.anInt414 = aClass23Array403[originalDataID].anInt414;
                gfx.anIntArray408 = aClass23Array403[originalDataID].anIntArray408;
                gfx.anIntArray409 = aClass23Array403[originalDataID].anIntArray409;
            } else
            {
                gfx.method265(true, class30_sub2_sub2);
            }
        }

    }
    public void method265(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                return;
            if(i == 1)
                anInt405 = class30_sub2_sub2.method410();
            else
            if(i == 2)
            {
                anInt406 = class30_sub2_sub2.method410();
                if(Class20.aClass20Array351 != null)
                    aClass20_407 = Class20.aClass20Array351[anInt406];
            } else
            if(i == 4)
                anInt410 = class30_sub2_sub2.method410();
            else
            if(i == 5)
                anInt411 = class30_sub2_sub2.method410();
            else
            if(i == 6)
                anInt412 = class30_sub2_sub2.method410();
            else
            if(i == 7)
                anInt413 = class30_sub2_sub2.method408();
            else
            if(i == 8)
                anInt414 = class30_sub2_sub2.method408();
            else
            if(i >= 40 && i < 50)
                anIntArray408[i - 40] = class30_sub2_sub2.method410();
            else
            if(i >= 50 && i < 60)
                anIntArray409[i - 50] = class30_sub2_sub2.method410();
            else
                System.out.println("Error unrecognised spotanim config code: " + i);
        } while(true);
    }

    public Class30_Sub2_Sub4_Sub6 method266()
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_415.method222(anInt404);
        if(class30_sub2_sub4_sub6 != null)
            return class30_sub2_sub4_sub6;
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt400, anInt405);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(anIntArray408[0] != 0)
                class30_sub2_sub4_sub6.method476(anIntArray408[i], anIntArray409[i]);

        aClass12_415.method223(class30_sub2_sub4_sub6, anInt404, (byte)2);
        return class30_sub2_sub4_sub6;
    }

    public Class23()
    {
        anInt400 = 9;
        anInt406 = -1;
        anIntArray408 = new int[6];
        anIntArray409 = new int[6];
        anInt410 = 128;
        anInt411 = 128;
    }

    private int anInt400;
    private static boolean aBoolean401 = true;
    public static int anInt402;
    public static Class23 aClass23Array403[];
    public int anInt404;
    public int anInt405;
    public int anInt406;
    public Class20 aClass20_407;
    public int anIntArray408[];
    public int anIntArray409[];
    public int anInt410;
    public int anInt411;
    public int anInt412;
    public int anInt413;
    public int anInt414;
    public static Class12 aClass12_415 = new Class12(false, 30);

}
