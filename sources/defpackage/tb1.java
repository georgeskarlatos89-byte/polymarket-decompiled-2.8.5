package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.radar.sdk.Radar;
import io.radar.sdk.Radar$updateTripLeg$1;
import io.radar.sdk.fraud.RadarSDKFraud;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarTrip;
import io.radar.sdk.model.RadarTripLeg;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.p5;
import io.sentry.protocol.j0;
import io.sentry.protocol.k0;
import io.sentry.x0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class tb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tb1(OverlayPresenter overlayPresenter, String str, List list, Intercom.Visibility visibility, Activity activity) {
        this.a = 3;
        this.b = overlayPresenter;
        this.d = str;
        this.c = list;
        this.e = visibility;
        this.f = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oqc oqcVar;
        oqc C;
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                xxi xxiVar = (xxi) obj5;
                owa owaVar = (owa) obj4;
                String str = (String) obj3;
                il6 il6Var = (il6) obj2;
                nh8 nh8Var = (nh8) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    kch h = qch.h();
                    if (h instanceof oqc) {
                        oqcVar = (oqc) h;
                    } else {
                        oqcVar = null;
                    }
                    if (oqcVar != null && (C = oqcVar.C(null, null)) != null) {
                        try {
                            kch j = C.j();
                            try {
                                c40 c40Var = new c40(str, a9m.h(xxiVar, owaVar), CollectionsKt.emptyList(), CollectionsKt.emptyList(), nh8Var, il6Var);
                                c40Var.b();
                                c40Var.c();
                                kch.q(j);
                                C.w().b();
                                C.c();
                                Trace.endSection();
                                return;
                            } catch (Throwable th) {
                                kch.q(j);
                                throw th;
                            }
                        } finally {
                        }
                    } else {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                DefaultInAppMessageFullViewFactory.a((View) obj5, (InAppMessageFullView) obj4, (gs9) obj3, (Context) obj2, (View) obj);
                return;
            case 2:
                h67 h67Var = (h67) obj5;
                hii hiiVar = (hii) obj4;
                hii hiiVar2 = (hii) obj3;
                View view = (View) obj;
                Window window = ((pk4) obj2).getWindow();
                window.getClass();
                Function1 function1 = hiiVar.d;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function12 = hiiVar2.d;
                Resources resources2 = view.getResources();
                resources2.getClass();
                h67Var.a(hiiVar, hiiVar2, window, view, booleanValue, ((Boolean) function12.invoke(resources2)).booleanValue());
                return;
            case 3:
                OverlayPresenter.d((OverlayPresenter) obj5, (String) obj3, (List) obj4, (Intercom.Visibility) obj2, (Activity) obj);
                return;
            case 4:
                Radar$updateTripLeg$1.a((Radar.RadarTripLegCallback) obj5, (Radar.RadarStatus) obj4, (RadarTrip) obj3, (RadarTripLeg) obj2, (RadarEvent[]) obj);
                return;
            case 5:
                RadarSDKFraud.d((RadarSDKFraud) obj5, (Context) obj4, (Location) obj3, (Function1) obj2, (Long) obj);
                return;
            default:
                AtomicReference atomicReference = (AtomicReference) obj5;
                View view2 = (View) obj4;
                List list = (List) obj3;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                x0 x0Var = (x0) obj;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    j0 j0Var = new j0("android_view_system", arrayList);
                    k0 b = ViewHierarchyEventProcessor.b(view2);
                    arrayList.add(b);
                    ViewHierarchyEventProcessor.a(view2, b, list);
                    atomicReference.set(j0Var);
                    countDownLatch.countDown();
                    return;
                } catch (Throwable th3) {
                    x0Var.d(p5.ERROR, "Failed to process view hierarchy.", th3);
                    return;
                }
        }
    }

    public /* synthetic */ tb1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
