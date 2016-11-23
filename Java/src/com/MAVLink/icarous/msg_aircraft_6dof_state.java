/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AIRCRAFT_6DOF_STATE PACKING
package com.MAVLink.icarous;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
* Aircraft state information
*/
public class msg_aircraft_6dof_state extends MAVLinkMessage{

    public static final int MAVLINK_MSG_ID_AIRCRAFT_6DOF_STATE = 225;
    public static final int MAVLINK_MSG_LENGTH = 24;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AIRCRAFT_6DOF_STATE;


      
    /**
    * latitude
    */
    public float lat;
      
    /**
    * longitude
    */
    public float lon;
      
    /**
    * altitude
    */
    public float alt;
      
    /**
    * roll
    */
    public float roll;
      
    /**
    * pitch
    */
    public float pitch;
      
    /**
    * yaw
    */
    public float yaw;
    

    /**
    * Generates the payload for a mavlink message for a message of this type
    * @return
    */
    public MAVLinkPacket pack(){
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_AIRCRAFT_6DOF_STATE;
              
        packet.payload.putFloat(lat);
              
        packet.payload.putFloat(lon);
              
        packet.payload.putFloat(alt);
              
        packet.payload.putFloat(roll);
              
        packet.payload.putFloat(pitch);
              
        packet.payload.putFloat(yaw);
        
        return packet;
    }

    /**
    * Decode a aircraft_6dof_state message into this class fields
    *
    * @param payload The message to decode
    */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
              
        this.lat = payload.getFloat();
              
        this.lon = payload.getFloat();
              
        this.alt = payload.getFloat();
              
        this.roll = payload.getFloat();
              
        this.pitch = payload.getFloat();
              
        this.yaw = payload.getFloat();
        
    }

    /**
    * Constructor for a new message, just initializes the msgid
    */
    public msg_aircraft_6dof_state(){
        msgid = MAVLINK_MSG_ID_AIRCRAFT_6DOF_STATE;
    }

    /**
    * Constructor for a new message, initializes the message with the payload
    * from a mavlink packet
    *
    */
    public msg_aircraft_6dof_state(MAVLinkPacket mavLinkPacket){
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_AIRCRAFT_6DOF_STATE;
        unpack(mavLinkPacket.payload);        
    }

                
    /**
    * Returns a string with the MSG name and data
    */
    public String toString(){
        return "MAVLINK_MSG_ID_AIRCRAFT_6DOF_STATE -"+" lat:"+lat+" lon:"+lon+" alt:"+alt+" roll:"+roll+" pitch:"+pitch+" yaw:"+yaw+"";
    }
}
        