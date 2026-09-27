package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class zgh extends GLSurfaceView {
    public static final /* synthetic */ int l = 0;
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final and d;
    public final Handler e;
    public final mig f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public zgh(Context context) {
        super(context, null);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        mig migVar = new mig();
        this.f = migVar;
        ygh yghVar = new ygh(this, migVar);
        View.OnTouchListener m6jVar = new m6j(context, yghVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new and(windowManager.getDefaultDisplay(), m6jVar, yghVar);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(yghVar);
        setOnTouchListener(m6jVar);
    }

    public final void a() {
        boolean z;
        if (this.i && this.j) {
            z = true;
        } else {
            z = false;
        }
        Sensor sensor = this.c;
        if (sensor != null && z != this.k) {
            and andVar = this.d;
            SensorManager sensorManager = this.b;
            if (z) {
                sensorManager.registerListener(andVar, sensor, 0);
            } else {
                sensorManager.unregisterListener(andVar);
            }
            this.k = z;
        }
    }

    public c13 getCameraMotionListener() {
        return this.f;
    }

    public h8k getVideoFrameMetadataListener() {
        return this.f;
    }

    public Surface getVideoSurface() {
        return this.h;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new wvb(this, 20));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.f.k = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        a();
    }
}
