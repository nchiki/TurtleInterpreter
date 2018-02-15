package turtle;

import turle.util.Direction;
import turle.util.Pen;
import turle.util.Rotation;

public class Turtle {
  public final String name;
  private int position;
  private Direction direction;
  private Pen pState;

  public Turtle(String name,/*position*/, Direction direction, Pen pState){
    this.name = name;
   // this.position = beenden
    this.direction = direction;
    this.pState = pState;

  }

  public void lift(){
    this.pState = Pen.UP;
  }

  //brush noch ändern

  public void rotate(Rotation rot, int num){
    for(int i = 0; i < num; i++){
      this.direction.rotate(rot);
    }
  }

  public void mark(){
    if(pState == Pen.DOWN){
      //noch beenden
    }
  }


}
