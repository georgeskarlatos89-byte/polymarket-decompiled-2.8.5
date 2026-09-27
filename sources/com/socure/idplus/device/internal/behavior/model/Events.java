package com.socure.idplus.device.internal.behavior.model;

import com.google.gson.annotations.SerializedName;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.idplus.device.internal.mediaDevice.model.MediaDeviceEvent;
import com.socure.idplus.device.internal.motion.model.AccelerometerEvent;
import com.socure.idplus.device.internal.motion.model.GyroscopeEvent;
import com.socure.idplus.device.internal.motion.model.LinearAccelerometerEvent;
import com.socure.idplus.device.internal.motion.model.MagnetometerEvent;
import com.socure.idplus.device.internal.motion.model.OrientationEvent;
import defpackage.ace;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0003\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0003\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0003HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003HÆ\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0003HÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0003HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0003HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0003HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0003HÆ\u0003J\u0085\u0002\u0010=\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00032\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00032\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020DHÖ\u0001R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!¨\u0006E"}, d2 = {"Lcom/socure/idplus/device/internal/behavior/model/Events;", "", "focusChangeEvents", "", "Lcom/socure/idplus/device/internal/behavior/model/FocusChangeEvent;", "inputChangeEvents", "Lcom/socure/idplus/device/internal/behavior/model/InputChangeEvent;", "keyPressEvents", "Lcom/socure/idplus/device/internal/behavior/model/KeyPressEvent;", "pointerEvents", "Lcom/socure/idplus/device/internal/behavior/model/PointerEvent;", "locationEvents", "Lcom/socure/idplus/device/internal/behavior/model/LocationEvent;", "viewportSizeEvents", "Lcom/socure/idplus/device/internal/behavior/model/ViewportSizeEvent;", "lifeCycleEvents", "Lcom/socure/idplus/device/internal/behavior/model/LifeCycleEvent;", "mediaDeviceEvents", "Lcom/socure/idplus/device/internal/mediaDevice/model/MediaDeviceEvent;", "accelerometerEvents", "Lcom/socure/idplus/device/internal/motion/model/AccelerometerEvent;", "gyroscopeEvents", "Lcom/socure/idplus/device/internal/motion/model/GyroscopeEvent;", "magnetometerEvents", "Lcom/socure/idplus/device/internal/motion/model/MagnetometerEvent;", "linearAccelerometerEvents", "Lcom/socure/idplus/device/internal/motion/model/LinearAccelerometerEvent;", "orientationEvents", "Lcom/socure/idplus/device/internal/motion/model/OrientationEvent;", "customEvents", "Lcom/socure/idplus/device/internal/behavior/model/CustomEvent;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAccelerometerEvents", "()Ljava/util/List;", "getCustomEvents", "getFocusChangeEvents", "getGyroscopeEvents", "getInputChangeEvents", "getKeyPressEvents", "getLifeCycleEvents", "getLinearAccelerometerEvents", "getLocationEvents", "getMagnetometerEvents", "getMediaDeviceEvents", "getOrientationEvents", "getPointerEvents", "getViewportSizeEvents", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Events {

    @SerializedName("accelerometerEvents")
    private final List<AccelerometerEvent> accelerometerEvents;

    @SerializedName("customEvents")
    private final List<CustomEvent> customEvents;

    @SerializedName("focusChangeEvents")
    private final List<FocusChangeEvent> focusChangeEvents;

    @SerializedName("gyroscopeEvents")
    private final List<GyroscopeEvent> gyroscopeEvents;

    @SerializedName("inputChangeEvents")
    private final List<InputChangeEvent> inputChangeEvents;

    @SerializedName("keyPressEvents")
    private final List<KeyPressEvent> keyPressEvents;

    @SerializedName("lifeCycleEvents")
    private final List<LifeCycleEvent> lifeCycleEvents;

    @SerializedName("linearAccelerometerEvents")
    private final List<LinearAccelerometerEvent> linearAccelerometerEvents;

    @SerializedName("locationEvents")
    private final List<LocationEvent> locationEvents;

    @SerializedName("magnetometerEvents")
    private final List<MagnetometerEvent> magnetometerEvents;

    @SerializedName("mediaDeviceEvents")
    private final List<MediaDeviceEvent> mediaDeviceEvents;

    @SerializedName("orientationEvents")
    private final List<OrientationEvent> orientationEvents;

    @SerializedName("pointerEvents")
    private final List<PointerEvent> pointerEvents;

    @SerializedName("viewportSizeEvents")
    private final List<ViewportSizeEvent> viewportSizeEvents;

    public Events(List<FocusChangeEvent> list, List<InputChangeEvent> list2, List<KeyPressEvent> list3, List<PointerEvent> list4, List<LocationEvent> list5, List<ViewportSizeEvent> list6, List<LifeCycleEvent> list7, List<MediaDeviceEvent> list8, List<AccelerometerEvent> list9, List<GyroscopeEvent> list10, List<MagnetometerEvent> list11, List<LinearAccelerometerEvent> list12, List<OrientationEvent> list13, List<CustomEvent> list14) {
        this.focusChangeEvents = list;
        this.inputChangeEvents = list2;
        this.keyPressEvents = list3;
        this.pointerEvents = list4;
        this.locationEvents = list5;
        this.viewportSizeEvents = list6;
        this.lifeCycleEvents = list7;
        this.mediaDeviceEvents = list8;
        this.accelerometerEvents = list9;
        this.gyroscopeEvents = list10;
        this.magnetometerEvents = list11;
        this.linearAccelerometerEvents = list12;
        this.orientationEvents = list13;
        this.customEvents = list14;
    }

    public static /* synthetic */ Events copy$default(Events events, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, int i, Object obj) {
        return events.copy((i & 1) != 0 ? events.focusChangeEvents : list, (i & 2) != 0 ? events.inputChangeEvents : list2, (i & 4) != 0 ? events.keyPressEvents : list3, (i & 8) != 0 ? events.pointerEvents : list4, (i & 16) != 0 ? events.locationEvents : list5, (i & 32) != 0 ? events.viewportSizeEvents : list6, (i & 64) != 0 ? events.lifeCycleEvents : list7, (i & 128) != 0 ? events.mediaDeviceEvents : list8, (i & 256) != 0 ? events.accelerometerEvents : list9, (i & Barcode.FORMAT_UPC_A) != 0 ? events.gyroscopeEvents : list10, (i & Barcode.FORMAT_UPC_E) != 0 ? events.magnetometerEvents : list11, (i & 2048) != 0 ? events.linearAccelerometerEvents : list12, (i & 4096) != 0 ? events.orientationEvents : list13, (i & 8192) != 0 ? events.customEvents : list14);
    }

    public final List<FocusChangeEvent> component1() {
        return this.focusChangeEvents;
    }

    public final List<GyroscopeEvent> component10() {
        return this.gyroscopeEvents;
    }

    public final List<MagnetometerEvent> component11() {
        return this.magnetometerEvents;
    }

    public final List<LinearAccelerometerEvent> component12() {
        return this.linearAccelerometerEvents;
    }

    public final List<OrientationEvent> component13() {
        return this.orientationEvents;
    }

    public final List<CustomEvent> component14() {
        return this.customEvents;
    }

    public final List<InputChangeEvent> component2() {
        return this.inputChangeEvents;
    }

    public final List<KeyPressEvent> component3() {
        return this.keyPressEvents;
    }

    public final List<PointerEvent> component4() {
        return this.pointerEvents;
    }

    public final List<LocationEvent> component5() {
        return this.locationEvents;
    }

    public final List<ViewportSizeEvent> component6() {
        return this.viewportSizeEvents;
    }

    public final List<LifeCycleEvent> component7() {
        return this.lifeCycleEvents;
    }

    public final List<MediaDeviceEvent> component8() {
        return this.mediaDeviceEvents;
    }

    public final List<AccelerometerEvent> component9() {
        return this.accelerometerEvents;
    }

    public final Events copy(List<FocusChangeEvent> focusChangeEvents, List<InputChangeEvent> inputChangeEvents, List<KeyPressEvent> keyPressEvents, List<PointerEvent> pointerEvents, List<LocationEvent> locationEvents, List<ViewportSizeEvent> viewportSizeEvents, List<LifeCycleEvent> lifeCycleEvents, List<MediaDeviceEvent> mediaDeviceEvents, List<AccelerometerEvent> accelerometerEvents, List<GyroscopeEvent> gyroscopeEvents, List<MagnetometerEvent> magnetometerEvents, List<LinearAccelerometerEvent> linearAccelerometerEvents, List<OrientationEvent> orientationEvents, List<CustomEvent> customEvents) {
        return new Events(focusChangeEvents, inputChangeEvents, keyPressEvents, pointerEvents, locationEvents, viewportSizeEvents, lifeCycleEvents, mediaDeviceEvents, accelerometerEvents, gyroscopeEvents, magnetometerEvents, linearAccelerometerEvents, orientationEvents, customEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Events)) {
            return false;
        }
        Events events = (Events) other;
        if (Intrinsics.areEqual(this.focusChangeEvents, events.focusChangeEvents) && Intrinsics.areEqual(this.inputChangeEvents, events.inputChangeEvents) && Intrinsics.areEqual(this.keyPressEvents, events.keyPressEvents) && Intrinsics.areEqual(this.pointerEvents, events.pointerEvents) && Intrinsics.areEqual(this.locationEvents, events.locationEvents) && Intrinsics.areEqual(this.viewportSizeEvents, events.viewportSizeEvents) && Intrinsics.areEqual(this.lifeCycleEvents, events.lifeCycleEvents) && Intrinsics.areEqual(this.mediaDeviceEvents, events.mediaDeviceEvents) && Intrinsics.areEqual(this.accelerometerEvents, events.accelerometerEvents) && Intrinsics.areEqual(this.gyroscopeEvents, events.gyroscopeEvents) && Intrinsics.areEqual(this.magnetometerEvents, events.magnetometerEvents) && Intrinsics.areEqual(this.linearAccelerometerEvents, events.linearAccelerometerEvents) && Intrinsics.areEqual(this.orientationEvents, events.orientationEvents) && Intrinsics.areEqual(this.customEvents, events.customEvents)) {
            return true;
        }
        return false;
    }

    public final List<AccelerometerEvent> getAccelerometerEvents() {
        return this.accelerometerEvents;
    }

    public final List<CustomEvent> getCustomEvents() {
        return this.customEvents;
    }

    public final List<FocusChangeEvent> getFocusChangeEvents() {
        return this.focusChangeEvents;
    }

    public final List<GyroscopeEvent> getGyroscopeEvents() {
        return this.gyroscopeEvents;
    }

    public final List<InputChangeEvent> getInputChangeEvents() {
        return this.inputChangeEvents;
    }

    public final List<KeyPressEvent> getKeyPressEvents() {
        return this.keyPressEvents;
    }

    public final List<LifeCycleEvent> getLifeCycleEvents() {
        return this.lifeCycleEvents;
    }

    public final List<LinearAccelerometerEvent> getLinearAccelerometerEvents() {
        return this.linearAccelerometerEvents;
    }

    public final List<LocationEvent> getLocationEvents() {
        return this.locationEvents;
    }

    public final List<MagnetometerEvent> getMagnetometerEvents() {
        return this.magnetometerEvents;
    }

    public final List<MediaDeviceEvent> getMediaDeviceEvents() {
        return this.mediaDeviceEvents;
    }

    public final List<OrientationEvent> getOrientationEvents() {
        return this.orientationEvents;
    }

    public final List<PointerEvent> getPointerEvents() {
        return this.pointerEvents;
    }

    public final List<ViewportSizeEvent> getViewportSizeEvents() {
        return this.viewportSizeEvents;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        List<FocusChangeEvent> list = this.focusChangeEvents;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<InputChangeEvent> list2 = this.inputChangeEvents;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List<KeyPressEvent> list3 = this.keyPressEvents;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List<PointerEvent> list4 = this.pointerEvents;
        if (list4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List<LocationEvent> list5 = this.locationEvents;
        if (list5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        List<ViewportSizeEvent> list6 = this.viewportSizeEvents;
        if (list6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        List<LifeCycleEvent> list7 = this.lifeCycleEvents;
        if (list7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        List<MediaDeviceEvent> list8 = this.mediaDeviceEvents;
        if (list8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list8.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        List<AccelerometerEvent> list9 = this.accelerometerEvents;
        if (list9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list9.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        List<GyroscopeEvent> list10 = this.gyroscopeEvents;
        if (list10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list10.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        List<MagnetometerEvent> list11 = this.magnetometerEvents;
        if (list11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list11.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        List<LinearAccelerometerEvent> list12 = this.linearAccelerometerEvents;
        if (list12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list12.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        List<OrientationEvent> list13 = this.orientationEvents;
        if (list13 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list13.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        List<CustomEvent> list14 = this.customEvents;
        if (list14 != null) {
            i = list14.hashCode();
        }
        return i14 + i;
    }

    public String toString() {
        List<FocusChangeEvent> list = this.focusChangeEvents;
        List<InputChangeEvent> list2 = this.inputChangeEvents;
        List<KeyPressEvent> list3 = this.keyPressEvents;
        List<PointerEvent> list4 = this.pointerEvents;
        List<LocationEvent> list5 = this.locationEvents;
        List<ViewportSizeEvent> list6 = this.viewportSizeEvents;
        List<LifeCycleEvent> list7 = this.lifeCycleEvents;
        List<MediaDeviceEvent> list8 = this.mediaDeviceEvents;
        List<AccelerometerEvent> list9 = this.accelerometerEvents;
        List<GyroscopeEvent> list10 = this.gyroscopeEvents;
        List<MagnetometerEvent> list11 = this.magnetometerEvents;
        List<LinearAccelerometerEvent> list12 = this.linearAccelerometerEvents;
        List<OrientationEvent> list13 = this.orientationEvents;
        List<CustomEvent> list14 = this.customEvents;
        StringBuilder sb = new StringBuilder("Events(focusChangeEvents=");
        sb.append(list);
        sb.append(", inputChangeEvents=");
        sb.append(list2);
        sb.append(", keyPressEvents=");
        ace.D(sb, list3, ", pointerEvents=", list4, ", locationEvents=");
        ace.D(sb, list5, ", viewportSizeEvents=", list6, ", lifeCycleEvents=");
        ace.D(sb, list7, ", mediaDeviceEvents=", list8, ", accelerometerEvents=");
        ace.D(sb, list9, ", gyroscopeEvents=", list10, ", magnetometerEvents=");
        ace.D(sb, list11, ", linearAccelerometerEvents=", list12, ", orientationEvents=");
        sb.append(list13);
        sb.append(", customEvents=");
        sb.append(list14);
        sb.append(")");
        return sb.toString();
    }
}
