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
package org.robovm.apple.uikit;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFontDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIFontDescriptorPtr extends Ptr<UIFontDescriptor, UIFontDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIFontDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIFontDescriptor() {}
    protected UIFontDescriptor(SkipInit skipInit) { super(skipInit); }
    public UIFontDescriptor(NSDictionary<NSString, ?> attributes) { super((SkipInit) null); initObject(initWithFontAttributes$(attributes)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "postscriptName")
    public native String getPostscriptName();
    @Property(selector = "pointSize")
    public native @MachineSizedFloat double getPointSize();
    @Property(selector = "matrix")
    public native @ByVal CGAffineTransform getMatrix();
    @Property(selector = "symbolicTraits")
    public native UIFontDescriptorSymbolicTraits getSymbolicTraits();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFamilyAttribute", optional=true)
    public static native NSString AttributeFamily();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorNameAttribute", optional=true)
    public static native NSString AttributeName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFaceAttribute", optional=true)
    public static native NSString AttributeFace();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorSizeAttribute", optional=true)
    public static native NSString AttributeSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorVisibleNameAttribute", optional=true)
    public static native NSString AttributeVisibleName();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorMatrixAttribute", optional=true)
    public static native NSString AttributeMatrix();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorCharacterSetAttribute", optional=true)
    public static native NSString AttributeCharacterSet();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorCascadeListAttribute", optional=true)
    public static native NSString AttributeCascadeList();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorTraitsAttribute", optional=true)
    public static native NSString AttributeTraits();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFixedAdvanceAttribute", optional=true)
    public static native NSString AttributeFixedAdvance();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorFeatureSettingsAttribute", optional=true)
    public static native NSString AttributeFeatureSettings();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontDescriptorTextStyleAttribute", optional=true)
    public static native NSString AttributeTextStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontSymbolicTrait", optional=true)
    public static native NSString TraitSymbolic();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontWeightTrait", optional=true)
    public static native NSString TraitWeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontWidthTrait", optional=true)
    public static native NSString TraitWidth();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontSlantTrait", optional=true)
    public static native NSString TraitSlant();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontFeatureTypeIdentifierKey", optional=true)
    public static native NSString FeatureTypeIdentifierKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontFeatureSelectorIdentifierKey", optional=true)
    public static native NSString FeatureSelectorIdentifierKey();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleHeadline", optional=true)
    public static native String TextStyleHeadline();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleBody", optional=true)
    public static native String TextStyleBody();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleSubheadline", optional=true)
    public static native String TextStyleSubheadline();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleFootnote", optional=true)
    public static native String TextStyleFootnote();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleCaption1", optional=true)
    public static native String TextStyleCaption1();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="UIFontTextStyleCaption2", optional=true)
    public static native String TextStyleCaption2();
    
    @Method(selector = "objectForKey:")
    public native NSObject getObject(String anAttribute);
    @Method(selector = "fontAttributes")
    public native NSDictionary<NSString, ?> getFontAttributes();
    @Method(selector = "matchingFontDescriptorsWithMandatoryKeys:")
    public native NSArray<UIFontDescriptor> getMatchingFontDescriptors(NSSet<NSString> mandatoryKeys);
    @Method(selector = "initWithFontAttributes:")
    protected native @Pointer long initWithFontAttributes$(NSDictionary<NSString, ?> attributes);
    @Method(selector = "fontDescriptorByAddingAttributes:")
    public native UIFontDescriptor createWithAttributes(NSDictionary<NSString, ?> attributes);
    @Method(selector = "fontDescriptorWithSymbolicTraits:")
    public native UIFontDescriptor newWithSymbolicTraits(UIFontDescriptorSymbolicTraits symbolicTraits);
    @Method(selector = "fontDescriptorWithSize:")
    public native UIFontDescriptor newWithSize(@MachineSizedFloat double newPointSize);
    @Method(selector = "fontDescriptorWithMatrix:")
    public native UIFontDescriptor newWithMatrix(@ByVal CGAffineTransform matrix);
    @Method(selector = "fontDescriptorWithFace:")
    public native UIFontDescriptor newWithFace(String newFace);
    @Method(selector = "fontDescriptorWithFamily:")
    public native UIFontDescriptor newWithFamily(String newFamily);
    @Method(selector = "fontDescriptorWithFontAttributes:")
    public static native UIFontDescriptor create(NSDictionary<NSString, ?> attributes);
    @Method(selector = "fontDescriptorWithName:size:")
    public static native UIFontDescriptor create(String fontName, @MachineSizedFloat double size);
    @Method(selector = "fontDescriptorWithName:matrix:")
    public static native UIFontDescriptor create(String fontName, @ByVal CGAffineTransform matrix);
    @Method(selector = "preferredFontDescriptorWithTextStyle:")
    public static native UIFontDescriptor getPreferredFontDescriptor(String style);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    /*</methods>*/
}
