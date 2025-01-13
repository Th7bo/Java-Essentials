package oefeningen.oefening2;

import oefeningen.oefening2.zee.GewapendeBoei;
import oefeningen.oefening2.zee.ZeeObject;

import java.util.ArrayList;

public class Spel {

    private ArrayList<ZeeObject> zeeObjecten = new ArrayList<>();

    public void voegZeeObjectToe(ZeeObject zeeObject) {
        zeeObjecten.add(zeeObject);
    }

    public void beweegZeeObject(int index, Punt punt) {
        if (zeeObjecten.size() <= index) return;
        ZeeObject zeeObject = zeeObjecten.get(index);
        if (!(zeeObject instanceof Beweegbaar)) return;
        ((Beweegbaar) zeeObject).beweegNaar(punt);
    }

    public void vuur() {
        for (ZeeObject zeeObject : zeeObjecten) {
            if (zeeObject instanceof GewapendeBoei) {
                for (ZeeObject enemy : zeeObjecten) {
                    ((GewapendeBoei) zeeObject).doeSchade(enemy);
                }
            }
        }
    }

    public int getAantalZeeObjecten() {
        return zeeObjecten.size();
    }

    public void printStatus() {
        for (ZeeObject zeeObject : zeeObjecten) {
            System.out.println(zeeObject)   ;
        }
    }

}
