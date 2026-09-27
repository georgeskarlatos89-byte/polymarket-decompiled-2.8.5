package com.socure.idplus.device.internal.mediaDevice.manager;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.os.SystemClock;
import com.socure.idplus.device.internal.mediaDevice.model.AudioInput;
import com.socure.idplus.device.internal.mediaDevice.model.AudioOutput;
import com.socure.idplus.device.internal.mediaDevice.model.Camera;
import com.socure.idplus.device.internal.mediaDevice.model.ChangeReason;
import com.socure.idplus.device.internal.mediaDevice.model.MediaDeviceEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g {
    public final Context a;
    public final d b;
    public final com.socure.idplus.device.internal.input.producer.g c;
    public MediaDeviceEvent d;

    public g(Context context, com.socure.idplus.device.internal.thread.e eVar) {
        d dVar = new d(context);
        context.getClass();
        eVar.getClass();
        this.a = context;
        this.b = dVar;
        com.socure.idplus.device.internal.input.producer.g gVar = new com.socure.idplus.device.internal.input.producer.g(eVar);
        gVar.c = true;
        this.c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0141, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, kotlin.collections.CollectionsKt.y0(r2)) == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MediaDeviceEvent a(ChangeReason changeReason) {
        List emptyList;
        List emptyList2;
        changeReason.getClass();
        List a = a();
        AudioManager a2 = this.b.a();
        if (a2 == null || (emptyList = e.a(a2)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        AudioManager a3 = this.b.a();
        if (a3 == null || (emptyList2 = e.b(a3)) == null) {
            emptyList2 = CollectionsKt.emptyList();
        }
        MediaDeviceEvent mediaDeviceEvent = new MediaDeviceEvent(a, emptyList, emptyList2, changeReason, SystemClock.uptimeMillis());
        MediaDeviceEvent mediaDeviceEvent2 = this.d;
        if (mediaDeviceEvent2 != null) {
            List<Camera> cameras = mediaDeviceEvent.getCameras();
            ArrayList arrayList = new ArrayList(CollectionsKt.w(cameras));
            Iterator<T> it = cameras.iterator();
            while (it.hasNext()) {
                arrayList.add(((Camera) it.next()).getId());
            }
            List y0 = CollectionsKt.y0(arrayList);
            List<Camera> cameras2 = mediaDeviceEvent2.getCameras();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(cameras2));
            Iterator<T> it2 = cameras2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Camera) it2.next()).getId());
            }
            if (Intrinsics.areEqual(y0, CollectionsKt.y0(arrayList2))) {
                List<AudioInput> audioInputs = mediaDeviceEvent.getAudioInputs();
                ArrayList arrayList3 = new ArrayList(CollectionsKt.w(audioInputs));
                Iterator<T> it3 = audioInputs.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((AudioInput) it3.next()).getId());
                }
                List y02 = CollectionsKt.y0(arrayList3);
                List<AudioInput> audioInputs2 = mediaDeviceEvent2.getAudioInputs();
                ArrayList arrayList4 = new ArrayList(CollectionsKt.w(audioInputs2));
                Iterator<T> it4 = audioInputs2.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((AudioInput) it4.next()).getId());
                }
                if (Intrinsics.areEqual(y02, CollectionsKt.y0(arrayList4))) {
                    List<AudioOutput> audioOutputs = mediaDeviceEvent.getAudioOutputs();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.w(audioOutputs));
                    Iterator<T> it5 = audioOutputs.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(((AudioOutput) it5.next()).getId());
                    }
                    List y03 = CollectionsKt.y0(arrayList5);
                    List<AudioOutput> audioOutputs2 = mediaDeviceEvent2.getAudioOutputs();
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.w(audioOutputs2));
                    Iterator<T> it6 = audioOutputs2.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(((AudioOutput) it6.next()).getId());
                    }
                }
            }
        }
        this.d = mediaDeviceEvent;
        com.socure.idplus.device.internal.input.producer.g gVar = this.c;
        gVar.getClass();
        gVar.a(mediaDeviceEvent);
        d dVar = this.b;
        f fVar = new f(this);
        dVar.getClass();
        c cVar = dVar.c;
        if (cVar != null && cVar.a != null && !cVar.d) {
            cVar.c = fVar;
            cVar.a();
        }
        MediaDeviceEvent mediaDeviceEvent3 = this.d;
        if (mediaDeviceEvent3 == null) {
            return mediaDeviceEvent;
        }
        return mediaDeviceEvent3;
    }

    public final List a() {
        try {
            Object systemService = this.a.getSystemService("camera");
            CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
            if (cameraManager == null) {
                return CollectionsKt.emptyList();
            }
            return com.socure.idplus.device.internal.mediaDevice.utils.a.a(cameraManager);
        } catch (Exception e) {
            e.getLocalizedMessage();
            com.socure.idplus.device.internal.logger.a aVar = com.socure.idplus.device.internal.logger.a.D;
            return CollectionsKt.emptyList();
        }
    }
}
