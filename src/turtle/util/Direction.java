package turtle.util;

import java.util.ArrayList;
import java.util.List;

public enum Direction {
  NORTH, WEST, SOUTH, EAST, NORTHEAST,
  NORTHWEST, SOUTHEAST, SOUTHWEST;

  public Direction rotate(Rotation rotation) {
   List<Direction> dir = new ArrayList<>();
   dir.add(NORTH);
   dir.add(NORTHEAST);
   dir.add(EAST);
   dir.add(SOUTHEAST);
   dir.add(SOUTH);
   dir.add(SOUTHWEST);
   dir.add(WEST);
   dir.add(NORTHWEST);
    if (rotation == Rotation.LEFT) {
    int firstInd = dir.indexOf(this);
    if(firstInd < dir.size()) {
      return dir.get(firstInd - 1);
    } if(firstInd == 0){
      return dir.get(dir.size()-1);
      }
    }else if(rotation == Rotation.RIGHT)
   {
     int firstInd = dir.indexOf(this);
     if(firstInd < dir.size() - 1) {
       return dir.get(firstInd + 1);
     } if(firstInd == dir.size() - 1){
       return dir.get(0);
     }
    }
   return this;
 }
  }
