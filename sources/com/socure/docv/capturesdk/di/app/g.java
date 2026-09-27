package com.socure.docv.capturesdk.di.app;

import android.app.Application;
import com.socure.docv.capturesdk.common.utils.AccelerometerManager;
import com.socure.docv.capturesdk.common.utils.AnnounceAccessibilityMessageUseCase;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import com.socure.docv.capturesdk.common.utils.GyroscopeManager;
import com.socure.docv.capturesdk.common.utils.MagnetometerManager;
import com.socure.docv.capturesdk.common.utils.SensorReadingsManager;
import com.socure.docv.capturesdk.common.utils.VarianceManager;
import com.socure.docv.capturesdk.feature.scanner.data.Container;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import com.socure.docv.capturesdk.feature.scanner.data.GuidingBox;
import com.socure.docv.capturesdk.feature.scanner.data.ViewDimensions;
import defpackage.zc7;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public abstract class g implements b {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public ViewDimensions j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;

    public g(Application application) {
        application.getClass();
        this.a = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(3));
        final int i = 0;
        this.b = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                g gVar = this.b;
                switch (i2) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        this.c = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(4));
        final int i2 = 1;
        this.d = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        this.e = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(5));
        final int i3 = 2;
        this.f = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        final int i4 = 3;
        this.g = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        this.h = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(6));
        zc7.a.getClass();
        this.i = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(7));
        this.j = new ViewDimensions(new Container(1, 1), new GuidingBox(1, 1, 0, 0, new Dimension(1.0d, 1.0d)), true);
        this.k = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(8));
        final int i5 = 4;
        this.l = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        final int i6 = 5;
        this.m = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        final int i7 = 6;
        this.n = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i7;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        final int i8 = 7;
        this.o = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i8;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        final int i9 = 8;
        this.p = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i9;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        final int i10 = 9;
        this.q = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(9));
        this.r = LazyKt.lazy(new Function0(this) { // from class: com.socure.docv.capturesdk.di.app.e
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i10;
                g gVar = this.b;
                switch (i22) {
                    case 0:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_CORNER_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.a.getValue(), 2);
                    case 1:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_BLUR_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.c.getValue(), 1);
                    case 2:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.e.getValue(), 2);
                    case 3:
                        return new com.socure.docv.capturesdk.core.provider.a(((a) gVar).u, ConstantsKt.DEFAULT_GLARE_INTENSITY_MODEL_FILE_NAME, (com.socure.docv.capturesdk.core.provider.interfaces.d) gVar.h.getValue(), 1);
                    case 4:
                        return new com.socure.docv.capturesdk.common.analytics.d(((a) gVar).u);
                    case 5:
                        return new com.socure.docv.capturesdk.common.analytics.b((d) gVar.i.getValue());
                    case 6:
                        return new AccelerometerManager(((a) gVar).u);
                    case 7:
                        return new GyroscopeManager(((a) gVar).u);
                    case 8:
                        return new MagnetometerManager(((a) gVar).u);
                    default:
                        return new SensorReadingsManager((AccelerometerManager) gVar.n.getValue(), (GyroscopeManager) gVar.o.getValue(), (MagnetometerManager) gVar.p.getValue(), new f(5));
                }
            }
        });
        this.s = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(10));
        this.t = LazyKt.lazy(new com.socure.docv.capturesdk.common.network.repository.e(this));
    }

    public final AnnounceAccessibilityMessageUseCase a() {
        return (AnnounceAccessibilityMessageUseCase) this.s.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final MagnetometerManager b() {
        return (MagnetometerManager) this.p.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d c() {
        return (com.socure.docv.capturesdk.core.provider.interfaces.d) this.d.getValue();
    }

    public final com.socure.docv.capturesdk.common.analytics.b d() {
        return (com.socure.docv.capturesdk.common.analytics.b) this.m.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d e() {
        return (com.socure.docv.capturesdk.core.provider.interfaces.d) this.g.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final ViewDimensions f() {
        return this.j;
    }

    public final d g() {
        return (d) this.i.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final AccelerometerManager h() {
        return (AccelerometerManager) this.n.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d j() {
        return (com.socure.docv.capturesdk.core.provider.interfaces.d) this.b.getValue();
    }

    public final com.socure.docv.capturesdk.core.storage.a k() {
        return (com.socure.docv.capturesdk.core.storage.a) this.k.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final com.socure.docv.capturesdk.core.provider.interfaces.d l() {
        return (com.socure.docv.capturesdk.core.provider.interfaces.d) this.f.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final VarianceManager m() {
        return (VarianceManager) this.q.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final SensorReadingsManager n() {
        return (SensorReadingsManager) this.r.getValue();
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final void o(ViewDimensions viewDimensions) {
        this.j = viewDimensions;
    }

    @Override // com.socure.docv.capturesdk.di.app.c
    public final GyroscopeManager p() {
        return (GyroscopeManager) this.o.getValue();
    }

    public final com.socure.docv.capturesdk.common.analytics.d q() {
        return (com.socure.docv.capturesdk.common.analytics.d) this.l.getValue();
    }
}
