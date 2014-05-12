/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.coreanimation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.opengles.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CATransition/*</name>*/ 
    extends /*<extends>*/CAAnimation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CATransitionPtr extends Ptr<CATransition, CATransitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CATransition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CATransition() {}
    protected CATransition(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "subtype")
    public native String getSubtype();
    @Property(selector = "setSubtype:")
    public native void setSubtype(String v);
    @Property(selector = "startProgress")
    public native float getStartProgress();
    @Property(selector = "setStartProgress:")
    public native void setStartProgress(float v);
    @Property(selector = "endProgress")
    public native float getEndProgress();
    @Property(selector = "setEndProgress:")
    public native void setEndProgress(float v);
    @Property(selector = "filter")
    public native NSObject getFilter();
    @Property(selector = "setFilter:")
    public native void setFilter(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionFade", optional=true)
    public static native String TypeFade();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionMoveIn", optional=true)
    public static native String TypeMoveIn();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionPush", optional=true)
    public static native String TypePush();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionReveal", optional=true)
    public static native String TypeReveal();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionFromRight", optional=true)
    public static native String SubtypeFromRight();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionFromLeft", optional=true)
    public static native String SubtypeFromLeft();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionFromTop", optional=true)
    public static native String SubtypeFromTop();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalValue(symbol="kCATransitionFromBottom", optional=true)
    public static native String SubtypeFromBottom();
    
    
    /*</methods>*/
}
