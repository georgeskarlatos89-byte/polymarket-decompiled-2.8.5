package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.attribution.RequestError;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.socure.docv.capturesdk.common.utils.SelfieConstants;
import defpackage.a81;
import defpackage.a9b;
import defpackage.ad9;
import defpackage.bd0;
import defpackage.db8;
import defpackage.hz4;
import defpackage.jkk;
import defpackage.m64;
import defpackage.mz4;
import defpackage.n4h;
import defpackage.nlf;
import defpackage.nz4;
import defpackage.oy4;
import defpackage.oz4;
import defpackage.p69;
import defpackage.ry9;
import defpackage.s19;
import defpackage.sz4;
import defpackage.t19;
import defpackage.uy4;
import defpackage.vl6;
import defpackage.vom;
import defpackage.wgd;
import defpackage.wy4;
import defpackage.x7k;
import defpackage.xy4;
import defpackage.yaf;
import defpackage.yb3;
import defpackage.yy4;
import defpackage.zh4;
import io.ably.lib.util.AgentHeaderCreator;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.sentry.android.core.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import okhttp3.internal.http2.Http2Connection;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static n4h p;
    public final SparseArray a;
    public final ArrayList b;
    public final oz4 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public hz4 j;
    public ry9 k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final yaf o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new oz4();
        this.d = 0;
        this.e = 0;
        this.f = bd0.API_PRIORITY_OTHER;
        this.g = bd0.API_PRIORITY_OTHER;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new yaf(this, this);
        e(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [n4h, java.lang.Object] */
    public static n4h getSharedValues() {
        n4h n4hVar = p;
        if (n4hVar == null) {
            ?? obj = new Object();
            new SparseIntArray();
            new HashMap();
            p = obj;
            return obj;
        }
        return n4hVar;
    }

    public final nz4 a(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof xy4) {
                return ((xy4) view.getLayoutParams()).p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof xy4) {
                return ((xy4) view.getLayoutParams()).p0;
            }
            return null;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof xy4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((uy4) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet, int i) {
        oz4 oz4Var = this.c;
        oz4Var.g0 = this;
        yaf yafVar = this.o;
        oz4Var.u0 = yafVar;
        oz4Var.s0.f = yafVar;
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nlf.b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        hz4 hz4Var = new hz4();
                        this.j = hz4Var;
                        hz4Var.g(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        oz4Var.D0 = this.i;
        a9b.q = oz4Var.W(Barcode.FORMAT_UPC_A);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new xy4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xy4, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = 0.0f;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new nz4();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nlf.b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = wy4.a.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.V = obtainStyledAttributes.getInt(index, marginLayoutParams.V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.p);
                    marginLayoutParams.p = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.q);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.r) % 360.0f;
                    marginLayoutParams.r = f;
                    if (f < 0.0f) {
                        marginLayoutParams.r = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.a);
                    break;
                case 6:
                    marginLayoutParams.b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.b);
                    break;
                case 7:
                    marginLayoutParams.c = obtainStyledAttributes.getFloat(index, marginLayoutParams.c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f);
                    marginLayoutParams.f = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.g);
                    marginLayoutParams.g = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.h);
                    marginLayoutParams.h = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.j);
                    marginLayoutParams.j = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.k);
                    marginLayoutParams.k = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.l);
                    marginLayoutParams.l = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.m);
                    marginLayoutParams.m = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.s);
                    marginLayoutParams.s = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case MlKitException.UNSUPPORTED /* 18 */:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.t);
                    marginLayoutParams.t = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case zh4.REMOTE_EXCEPTION /* 19 */:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.u);
                    marginLayoutParams.u = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.v);
                    marginLayoutParams.v = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    marginLayoutParams.w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.w);
                    break;
                case 22:
                    marginLayoutParams.x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.x);
                    break;
                case 23:
                    marginLayoutParams.y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.y);
                    break;
                case 24:
                    marginLayoutParams.z = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.z);
                    break;
                case 25:
                    marginLayoutParams.A = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.A);
                    break;
                case 26:
                    marginLayoutParams.B = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.B);
                    break;
                case 27:
                    marginLayoutParams.W = obtainStyledAttributes.getBoolean(index, marginLayoutParams.W);
                    break;
                case 28:
                    marginLayoutParams.X = obtainStyledAttributes.getBoolean(index, marginLayoutParams.X);
                    break;
                case 29:
                    marginLayoutParams.E = obtainStyledAttributes.getFloat(index, marginLayoutParams.E);
                    break;
                case SelfieConstants.EXPAND_GUIDING_BOX_PERCENTAGE /* 30 */:
                    marginLayoutParams.F = obtainStyledAttributes.getFloat(index, marginLayoutParams.F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.L = i3;
                    if (i3 == 1) {
                        m0.d("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.M = i4;
                    if (i4 == 1) {
                        m0.d("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.N = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.N) == -2) {
                            marginLayoutParams.N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.P = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.P) == -2) {
                            marginLayoutParams.P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                    marginLayoutParams.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.R));
                    marginLayoutParams.L = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.O = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.O) == -2) {
                            marginLayoutParams.O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.Q = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Q) == -2) {
                            marginLayoutParams.Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.S));
                    marginLayoutParams.M = 2;
                    break;
                default:
                    switch (i2) {
                        case Carousel.ENTITY_TYPE /* 44 */:
                            hz4.j(marginLayoutParams, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            marginLayoutParams.H = obtainStyledAttributes.getFloat(index, marginLayoutParams.H);
                            break;
                        case 46:
                            marginLayoutParams.I = obtainStyledAttributes.getFloat(index, marginLayoutParams.I);
                            break;
                        case 47:
                            marginLayoutParams.J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.T = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.T);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            marginLayoutParams.U = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.U);
                            break;
                        case 51:
                            marginLayoutParams.Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.n);
                            marginLayoutParams.n = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.o);
                            marginLayoutParams.o = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            marginLayoutParams.D = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.D);
                            break;
                        case 55:
                            marginLayoutParams.C = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    hz4.i(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    hz4.i(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    marginLayoutParams.Z = obtainStyledAttributes.getInt(index, marginLayoutParams.Z);
                                    break;
                                case 67:
                                    marginLayoutParams.d = obtainStyledAttributes.getBoolean(index, marginLayoutParams.d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        oz4 oz4Var = this.c;
        String str = oz4Var.j;
        if (str == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
                oz4Var.j = str;
            } else {
                str = "parent";
                oz4Var.j = "parent";
            }
        }
        if (oz4Var.i0 == null) {
            oz4Var.i0 = str;
        }
        Iterator it = oz4Var.q0.iterator();
        while (it.hasNext()) {
            nz4 nz4Var = (nz4) it.next();
            View view = nz4Var.g0;
            if (view != null) {
                if (nz4Var.j == null && (id = view.getId()) != -1) {
                    nz4Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (nz4Var.i0 == null) {
                    nz4Var.i0 = nz4Var.j;
                }
            }
        }
        oz4Var.n(sb);
        return sb.toString();
    }

    public final void i(int i) {
        String str;
        Context context = getContext();
        ry9 ry9Var = new ry9(29);
        ry9Var.b = new SparseArray();
        ry9Var.c = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            wgd wgdVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                ry9Var.K(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                wgd wgdVar2 = new wgd(context, xml);
                                ((SparseArray) ry9Var.b).put(wgdVar2.b, wgdVar2);
                                wgdVar = wgdVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                yy4 yy4Var = new yy4(context, xml);
                                if (wgdVar != null) {
                                    ((ArrayList) wgdVar.d).add(yy4Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                    name.equals(str);
                }
            }
        } catch (IOException e) {
            m0.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            m0.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.k = ry9Var;
    }

    public final void j(oz4 oz4Var, int i, int i2, int i3) {
        mz4 mz4Var;
        mz4 mz4Var2;
        int i4;
        int i5;
        int max;
        int i6;
        char c;
        boolean z;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        yaf yafVar;
        boolean z5;
        int i8;
        boolean z6;
        boolean z7;
        int i9;
        ArrayList arrayList;
        yaf yafVar2;
        boolean z8;
        boolean z9;
        yaf yafVar3;
        int i10;
        boolean z10;
        ad9 ad9Var;
        x7k x7kVar;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max2 = Math.max(0, getPaddingTop());
        int max3 = Math.max(0, getPaddingBottom());
        int i15 = max2 + max3;
        int paddingWidth = getPaddingWidth();
        yaf yafVar4 = this.o;
        yafVar4.a = max2;
        yafVar4.b = max3;
        yafVar4.c = paddingWidth;
        yafVar4.d = i15;
        yafVar4.e = i2;
        yafVar4.f = i3;
        int max4 = Math.max(0, getPaddingStart());
        int max5 = Math.max(0, getPaddingEnd());
        if (max4 <= 0 && max5 <= 0) {
            max4 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max4 = max5;
        }
        int i16 = size - paddingWidth;
        int i17 = size2 - i15;
        int i18 = yafVar4.d;
        int i19 = yafVar4.c;
        mz4 mz4Var3 = mz4.FIXED;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i5 = 0;
                } else {
                    i5 = Math.min(this.f - i19, i16);
                }
                i4 = Integer.MIN_VALUE;
                mz4Var2 = mz4Var3;
            } else {
                mz4Var = mz4.WRAP_CONTENT;
                if (childCount == 0) {
                    max = Math.max(0, this.d);
                    mz4 mz4Var4 = mz4Var;
                    i5 = max;
                    mz4Var2 = mz4Var4;
                    i4 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i4 = Integer.MIN_VALUE;
                    mz4Var2 = mz4Var;
                }
            }
        } else {
            mz4Var = mz4.WRAP_CONTENT;
            if (childCount == 0) {
                max = Math.max(0, this.d);
                mz4 mz4Var42 = mz4Var;
                i5 = max;
                mz4Var2 = mz4Var42;
                i4 = Integer.MIN_VALUE;
            } else {
                mz4Var2 = mz4Var;
                i4 = Integer.MIN_VALUE;
                i5 = i16;
            }
        }
        if (mode2 != i4) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    i6 = Math.min(this.g - i18, i17);
                }
                i6 = 0;
            } else {
                mz4Var3 = mz4.WRAP_CONTENT;
                if (childCount == 0) {
                    i6 = Math.max(0, this.e);
                }
                i6 = 0;
            }
        } else {
            mz4Var3 = mz4.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.e);
            } else {
                i6 = i17;
            }
        }
        int q = oz4Var.q();
        vl6 vl6Var = oz4Var.s0;
        int[] iArr = oz4Var.C;
        if (i5 == q && i6 == oz4Var.k()) {
            c = 1;
        } else {
            vl6Var.c = true;
            c = 1;
        }
        oz4Var.Z = 0;
        oz4Var.a0 = 0;
        iArr[0] = this.f - i19;
        iArr[c] = this.g - i18;
        oz4Var.c0 = 0;
        oz4Var.d0 = 0;
        oz4Var.M(mz4Var2);
        oz4Var.O(i5);
        oz4Var.N(mz4Var3);
        oz4Var.L(i6);
        int i20 = this.d - i19;
        if (i20 < 0) {
            oz4Var.c0 = 0;
        } else {
            oz4Var.c0 = i20;
        }
        int i21 = this.e - i18;
        if (i21 < 0) {
            oz4Var.d0 = 0;
        } else {
            oz4Var.d0 = i21;
        }
        oz4Var.x0 = max4;
        oz4Var.y0 = max2;
        m64 m64Var = oz4Var.r0;
        oz4 oz4Var2 = (oz4) m64Var.c;
        ArrayList arrayList2 = (ArrayList) m64Var.a;
        yaf yafVar5 = oz4Var.u0;
        int size3 = oz4Var.q0.size();
        int q2 = oz4Var.q();
        int k = oz4Var.k();
        boolean d = vom.d(i, 128);
        if (!d && !vom.d(i, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i22 = 0;
            while (i22 < size3) {
                boolean z17 = z;
                nz4 nz4Var = (nz4) oz4Var.q0.get(i22);
                int i23 = i22;
                mz4[] mz4VarArr = nz4Var.T;
                mz4 mz4Var5 = mz4VarArr[0];
                i7 = size3;
                mz4 mz4Var6 = mz4.MATCH_CONSTRAINT;
                if (mz4Var5 == mz4Var6) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (mz4VarArr[1] == mz4Var6) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z14 && z15 && nz4Var.X > 0.0f) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if ((nz4Var.x() && z16) || ((nz4Var.y() && z16) || (nz4Var instanceof db8) || nz4Var.x() || nz4Var.y())) {
                    z2 = false;
                    break;
                } else {
                    i22 = i23 + 1;
                    z = z17;
                    size3 = i7;
                }
            }
        }
        i7 = size3;
        z2 = z;
        if ((mode == 1073741824 && mode2 == 1073741824) || d) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z18 = z2 & z3;
        if (z18) {
            int min = Math.min(iArr[0], i16);
            int min2 = Math.min(iArr[1], i17);
            int i24 = 1073741824;
            if (mode == 1073741824) {
                if (oz4Var.q() != min) {
                    oz4Var.O(min);
                    vl6Var.b = true;
                }
                i24 = 1073741824;
            }
            if (mode2 == i24 && oz4Var.k() != min2) {
                oz4Var.L(min2);
                vl6Var.b = true;
            }
            if (mode == i24 && mode2 == i24) {
                ArrayList arrayList3 = vl6Var.e;
                oz4 oz4Var3 = vl6Var.a;
                if (!vl6Var.b && !vl6Var.c) {
                    z4 = z18;
                    i13 = 0;
                } else {
                    Iterator it = oz4Var3.q0.iterator();
                    while (it.hasNext()) {
                        nz4 nz4Var2 = (nz4) it.next();
                        nz4Var2.h();
                        nz4Var2.a = false;
                        nz4Var2.d.n();
                        nz4Var2.e.m();
                        z18 = z18;
                    }
                    z4 = z18;
                    oz4Var3.h();
                    i13 = 0;
                    oz4Var3.a = false;
                    oz4Var3.d.n();
                    oz4Var3.e.m();
                    vl6Var.c = false;
                }
                vl6Var.b(vl6Var.d);
                oz4Var3.Z = i13;
                mz4[] mz4VarArr2 = oz4Var3.T;
                oz4Var3.a0 = i13;
                mz4 j = oz4Var3.j(i13);
                mz4 j2 = oz4Var3.j(1);
                if (vl6Var.b) {
                    vl6Var.c();
                }
                int r = oz4Var3.r();
                int s = oz4Var3.s();
                yafVar = yafVar5;
                oz4Var3.d.h.d(r);
                oz4Var3.e.h.d(s);
                vl6Var.g();
                mz4 mz4Var7 = mz4.WRAP_CONTENT;
                if (j != mz4Var7 && j2 != mz4Var7) {
                    i14 = r;
                } else {
                    if (d) {
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!((jkk) it2.next()).k()) {
                                    d = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (d && j == mz4.WRAP_CONTENT) {
                        oz4Var3.M(mz4.FIXED);
                        i14 = r;
                        oz4Var3.O(vl6Var.d(oz4Var3, 0));
                        oz4Var3.d.e.d(oz4Var3.q());
                    } else {
                        i14 = r;
                    }
                    if (d && j2 == mz4.WRAP_CONTENT) {
                        oz4Var3.N(mz4.FIXED);
                        oz4Var3.L(vl6Var.d(oz4Var3, 1));
                        oz4Var3.e.e.d(oz4Var3.k());
                    }
                }
                mz4 mz4Var8 = mz4VarArr2[0];
                mz4 mz4Var9 = mz4.FIXED;
                if (mz4Var8 != mz4Var9 && mz4Var8 != mz4.MATCH_PARENT) {
                    z13 = false;
                } else {
                    int q3 = oz4Var3.q() + i14;
                    oz4Var3.d.i.d(q3);
                    oz4Var3.d.e.d(q3 - i14);
                    vl6Var.g();
                    mz4 mz4Var10 = mz4VarArr2[1];
                    if (mz4Var10 == mz4Var9 || mz4Var10 == mz4.MATCH_PARENT) {
                        int k2 = oz4Var3.k() + s;
                        oz4Var3.e.i.d(k2);
                        oz4Var3.e.e.d(k2 - s);
                    }
                    vl6Var.g();
                    z13 = true;
                }
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    jkk jkkVar = (jkk) it3.next();
                    if (jkkVar.b != oz4Var3 || jkkVar.g) {
                        jkkVar.e();
                    }
                }
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    jkk jkkVar2 = (jkk) it4.next();
                    if (z13 || jkkVar2.b != oz4Var3) {
                        if (!jkkVar2.h.j || ((!jkkVar2.i.j && !(jkkVar2 instanceof t19)) || (!jkkVar2.e.j && !(jkkVar2 instanceof yb3) && !(jkkVar2 instanceof t19)))) {
                            z5 = false;
                            break;
                        }
                    }
                }
                z5 = true;
                oz4Var3.M(j);
                oz4Var3.N(j2);
                i8 = 2;
                i12 = 1073741824;
            } else {
                z4 = z18;
                yafVar = yafVar5;
                oz4 oz4Var4 = vl6Var.a;
                if (vl6Var.b) {
                    Iterator it5 = oz4Var4.q0.iterator();
                    while (it5.hasNext()) {
                        nz4 nz4Var3 = (nz4) it5.next();
                        nz4Var3.h();
                        nz4Var3.a = false;
                        ad9 ad9Var2 = nz4Var3.d;
                        ad9Var2.e.j = false;
                        ad9Var2.g = false;
                        ad9Var2.n();
                        x7k x7kVar2 = nz4Var3.e;
                        x7kVar2.e.j = false;
                        x7kVar2.g = false;
                        x7kVar2.m();
                    }
                    i11 = 0;
                    oz4Var4.h();
                    oz4Var4.a = false;
                    ad9 ad9Var3 = oz4Var4.d;
                    ad9Var3.e.j = false;
                    ad9Var3.g = false;
                    ad9Var3.n();
                    x7k x7kVar3 = oz4Var4.e;
                    x7kVar3.e.j = false;
                    x7kVar3.g = false;
                    x7kVar3.m();
                    vl6Var.c();
                } else {
                    i11 = 0;
                }
                vl6Var.b(vl6Var.d);
                oz4Var4.Z = i11;
                oz4Var4.a0 = i11;
                oz4Var4.d.h.d(i11);
                oz4Var4.e.h.d(i11);
                i12 = 1073741824;
                if (mode == 1073741824) {
                    z5 = oz4Var.T(i11, d);
                    i8 = 1;
                } else {
                    z5 = true;
                    i8 = 0;
                }
                if (mode2 == 1073741824) {
                    z5 &= oz4Var.T(1, d);
                    i8++;
                }
            }
            if (z5) {
                if (mode == i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (mode2 == i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                oz4Var.P(z11, z12);
            }
        } else {
            z4 = z18;
            yafVar = yafVar5;
            z5 = false;
            i8 = 0;
        }
        if (z5 && i8 == 2) {
            return;
        }
        int i25 = oz4Var.D0;
        if (i7 > 0) {
            int size4 = oz4Var.q0.size();
            boolean W = oz4Var.W(64);
            yaf yafVar6 = oz4Var.u0;
            int i26 = 0;
            while (i26 < size4) {
                nz4 nz4Var4 = (nz4) oz4Var.q0.get(i26);
                if ((nz4Var4 instanceof s19) || (nz4Var4 instanceof a81) || nz4Var4.F || (W && (ad9Var = nz4Var4.d) != null && (x7kVar = nz4Var4.e) != null && ad9Var.e.j && x7kVar.e.j)) {
                    i10 = size4;
                } else {
                    mz4 j3 = nz4Var4.j(0);
                    mz4 j4 = nz4Var4.j(1);
                    mz4 mz4Var11 = mz4.MATCH_CONSTRAINT;
                    i10 = size4;
                    if (j3 == mz4Var11 && nz4Var4.r != 1 && j4 == mz4Var11 && nz4Var4.s != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && oz4Var.W(1) && !(nz4Var4 instanceof db8)) {
                        if (j3 == mz4Var11 && nz4Var4.r == 0 && j4 != mz4Var11 && !nz4Var4.x()) {
                            z10 = true;
                        }
                        if (j4 == mz4Var11 && nz4Var4.s == 0 && j3 != mz4Var11 && !nz4Var4.x()) {
                            z10 = true;
                        }
                        if ((j3 == mz4Var11 || j4 == mz4Var11) && nz4Var4.X > 0.0f) {
                            z10 = true;
                        }
                    }
                    if (!z10) {
                        m64Var.I(0, nz4Var4, yafVar6);
                    }
                }
                i26++;
                size4 = i10;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) yafVar6.g;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList4 = constraintLayout.b;
            for (int i27 = 0; i27 < childCount2; i27++) {
                constraintLayout.getChildAt(i27);
            }
            int size5 = arrayList4.size();
            if (size5 > 0) {
                for (int i28 = 0; i28 < size5; i28++) {
                    ((uy4) arrayList4.get(i28)).getClass();
                }
            }
        }
        m64Var.R(oz4Var);
        int size6 = arrayList2.size();
        if (i7 > 0) {
            m64Var.P(oz4Var, 0, q2, k);
        }
        if (size6 > 0) {
            mz4[] mz4VarArr3 = oz4Var.T;
            mz4 mz4Var12 = mz4VarArr3[0];
            mz4 mz4Var13 = mz4.WRAP_CONTENT;
            if (mz4Var12 == mz4Var13) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (mz4VarArr3[1] == mz4Var13) {
                z7 = true;
            } else {
                z7 = false;
            }
            int max6 = Math.max(oz4Var.q(), oz4Var2.c0);
            int max7 = Math.max(oz4Var.k(), oz4Var2.d0);
            int i29 = 0;
            boolean z19 = false;
            while (i29 < size6) {
                nz4 nz4Var5 = (nz4) arrayList2.get(i29);
                if (!(nz4Var5 instanceof db8)) {
                    z8 = z7;
                    z9 = z6;
                    yafVar3 = yafVar;
                } else {
                    int q4 = nz4Var5.q();
                    int k3 = nz4Var5.k();
                    z8 = z7;
                    z9 = z6;
                    yafVar3 = yafVar;
                    boolean I = z19 | m64Var.I(1, nz4Var5, yafVar3);
                    int q5 = nz4Var5.q();
                    boolean z20 = I;
                    int k4 = nz4Var5.k();
                    if (q5 != q4) {
                        nz4Var5.O(q5);
                        if (z9 && nz4Var5.r() + nz4Var5.V > max6) {
                            max6 = Math.max(max6, nz4Var5.i(oy4.RIGHT).e() + nz4Var5.r() + nz4Var5.V);
                        }
                        z20 = true;
                    }
                    if (k4 != k3) {
                        nz4Var5.L(k4);
                        if (z8 && nz4Var5.s() + nz4Var5.W > max7) {
                            max7 = Math.max(max7, nz4Var5.i(oy4.BOTTOM).e() + nz4Var5.s() + nz4Var5.W);
                        }
                        z20 = true;
                    }
                    z19 = z20 | ((db8) nz4Var5).y0;
                }
                i29++;
                z6 = z9;
                yafVar = yafVar3;
                z7 = z8;
            }
            boolean z21 = z7;
            boolean z22 = z6;
            int i30 = 0;
            while (true) {
                yaf yafVar7 = yafVar;
                if (i30 >= 2) {
                    break;
                }
                int i31 = 0;
                while (i31 < size6) {
                    nz4 nz4Var6 = (nz4) arrayList2.get(i31);
                    if (((nz4Var6 instanceof p69) && !(nz4Var6 instanceof db8)) || (nz4Var6 instanceof s19) || nz4Var6.h0 == 8 || ((z4 && nz4Var6.d.e.j && nz4Var6.e.e.j) || (nz4Var6 instanceof db8))) {
                        i9 = size6;
                        yafVar2 = yafVar7;
                        arrayList = arrayList2;
                    } else {
                        int q6 = nz4Var6.q();
                        int k5 = nz4Var6.k();
                        i9 = size6;
                        int i32 = nz4Var6.b0;
                        arrayList = arrayList2;
                        int i33 = 1;
                        if (i30 == 1) {
                            i33 = 2;
                        }
                        boolean I2 = m64Var.I(i33, nz4Var6, yafVar7) | z19;
                        int q7 = nz4Var6.q();
                        yafVar2 = yafVar7;
                        int k6 = nz4Var6.k();
                        if (q7 != q6) {
                            nz4Var6.O(q7);
                            if (z22 && nz4Var6.r() + nz4Var6.V > max6) {
                                max6 = Math.max(max6, nz4Var6.i(oy4.RIGHT).e() + nz4Var6.r() + nz4Var6.V);
                            }
                            I2 = true;
                        }
                        if (k6 != k5) {
                            nz4Var6.L(k6);
                            if (z21 && nz4Var6.s() + nz4Var6.W > max7) {
                                max7 = Math.max(max7, nz4Var6.i(oy4.BOTTOM).e() + nz4Var6.s() + nz4Var6.W);
                            }
                            I2 = true;
                        }
                        if (nz4Var6.E && i32 != nz4Var6.b0) {
                            z19 = true;
                        } else {
                            z19 = I2;
                        }
                    }
                    i31++;
                    size6 = i9;
                    arrayList2 = arrayList;
                    yafVar7 = yafVar2;
                }
                int i34 = size6;
                yafVar = yafVar7;
                ArrayList arrayList5 = arrayList2;
                if (!z19) {
                    break;
                }
                i30++;
                m64Var.P(oz4Var, i30, q2, k);
                size6 = i34;
                arrayList2 = arrayList5;
                z19 = false;
            }
        }
        oz4Var.D0 = i25;
        a9b.q = oz4Var.W(Barcode.FORMAT_UPC_A);
    }

    public final void k(nz4 nz4Var, xy4 xy4Var, SparseArray sparseArray, int i, oy4 oy4Var) {
        View view = (View) this.a.get(i);
        nz4 nz4Var2 = (nz4) sparseArray.get(i);
        if (nz4Var2 != null && view != null && (view.getLayoutParams() instanceof xy4)) {
            xy4Var.c0 = true;
            oy4 oy4Var2 = oy4.BASELINE;
            if (oy4Var == oy4Var2) {
                xy4 xy4Var2 = (xy4) view.getLayoutParams();
                xy4Var2.c0 = true;
                xy4Var2.p0.E = true;
            }
            nz4Var.i(oy4Var2).b(nz4Var2.i(oy4Var), xy4Var.D, xy4Var.C, true);
            nz4Var.E = true;
            nz4Var.i(oy4.TOP).j();
            nz4Var.i(oy4.BOTTOM).j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            xy4 xy4Var = (xy4) childAt.getLayoutParams();
            nz4 nz4Var = xy4Var.p0;
            if (childAt.getVisibility() != 8 || xy4Var.d0 || xy4Var.e0 || isInEditMode) {
                int r = nz4Var.r();
                int s = nz4Var.s();
                childAt.layout(r, s, nz4Var.q() + r, nz4Var.k() + s);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((uy4) arrayList.get(i6)).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        nz4 nz4Var;
        nz4 nz4Var2;
        nz4 nz4Var3;
        nz4 nz4Var4;
        nz4 nz4Var5;
        xy4 xy4Var;
        nz4 nz4Var6;
        int i4;
        int i5;
        int i6;
        int i7;
        float parseFloat;
        int i8;
        char c;
        SparseArray sparseArray;
        ArrayList arrayList;
        ArrayList arrayList2;
        SparseArray sparseArray2;
        String str;
        int f;
        int i9;
        String resourceName;
        int id;
        nz4 nz4Var7;
        String str2;
        ConstraintLayout constraintLayout = this;
        boolean z4 = constraintLayout.h;
        constraintLayout.h = z4;
        int i10 = 1;
        int i11 = 0;
        if (!z4) {
            int childCount = constraintLayout.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i12).isLayoutRequested()) {
                    constraintLayout.h = true;
                    break;
                }
                i12++;
            }
        }
        if ((constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection()) {
            z = true;
        } else {
            z = false;
        }
        oz4 oz4Var = constraintLayout.c;
        oz4Var.v0 = z;
        if (constraintLayout.h) {
            constraintLayout.h = false;
            int childCount2 = constraintLayout.getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 < childCount2) {
                    if (constraintLayout.getChildAt(i13).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i13++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                boolean isInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    nz4 a = constraintLayout.a(constraintLayout.getChildAt(i14));
                    if (a != null) {
                        a.C();
                    }
                }
                SparseArray sparseArray3 = constraintLayout.a;
                if (isInEditMode) {
                    int i15 = 0;
                    while (i15 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i15);
                        try {
                            resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i9 = i10;
                                try {
                                    if (constraintLayout.m == null) {
                                        constraintLayout.m = new HashMap();
                                    }
                                    int indexOf = resourceName.indexOf(AgentHeaderCreator.AGENT_DIVIDER);
                                    if (indexOf != -1) {
                                        str2 = resourceName.substring(indexOf + 1);
                                    } else {
                                        str2 = resourceName;
                                    }
                                    constraintLayout.m.put(str2, valueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i9 = i10;
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused2) {
                            i9 = i10;
                        }
                        if (id != 0) {
                            View view = (View) sparseArray3.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                if (view == null) {
                                    nz4Var7 = null;
                                } else {
                                    nz4Var7 = ((xy4) view.getLayoutParams()).p0;
                                }
                                nz4Var7.i0 = resourceName;
                                i15++;
                                i10 = i9;
                            }
                        }
                        nz4Var7 = oz4Var;
                        nz4Var7.i0 = resourceName;
                        i15++;
                        i10 = i9;
                    }
                }
                int i16 = i10;
                if (constraintLayout.l != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        constraintLayout.getChildAt(i17).getId();
                    }
                }
                hz4 hz4Var = constraintLayout.j;
                if (hz4Var != null) {
                    hz4Var.a(constraintLayout);
                }
                oz4Var.q0.clear();
                ArrayList arrayList3 = constraintLayout.b;
                int size = arrayList3.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i18 < size) {
                        uy4 uy4Var = (uy4) arrayList3.get(i18);
                        HashMap hashMap = uy4Var.g;
                        if (uy4Var.isInEditMode()) {
                            uy4Var.setIds(uy4Var.e);
                        }
                        p69 p69Var = uy4Var.d;
                        if (p69Var == null) {
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                        } else {
                            p69Var.r0 = i11;
                            Arrays.fill(p69Var.q0, (Object) null);
                            int i19 = i11;
                            while (i19 < uy4Var.b) {
                                int i20 = uy4Var.a[i19];
                                View view2 = (View) sparseArray3.get(i20);
                                if (view2 == null && (f = uy4Var.f(constraintLayout, (str = (String) hashMap.get(Integer.valueOf(i20))))) != 0) {
                                    arrayList2 = arrayList3;
                                    uy4Var.a[i19] = f;
                                    hashMap.put(Integer.valueOf(f), str);
                                    view2 = (View) sparseArray3.get(f);
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                View view3 = view2;
                                if (view3 != null) {
                                    p69 p69Var2 = uy4Var.d;
                                    nz4 a2 = constraintLayout.a(view3);
                                    p69Var2.getClass();
                                    if (a2 != p69Var2 && a2 != null) {
                                        int i21 = p69Var2.r0 + 1;
                                        sparseArray2 = sparseArray3;
                                        nz4[] nz4VarArr = p69Var2.q0;
                                        if (i21 > nz4VarArr.length) {
                                            nz4VarArr = (nz4[]) Arrays.copyOf(nz4VarArr, nz4VarArr.length * 2);
                                            p69Var2.q0 = nz4VarArr;
                                        }
                                        int i22 = p69Var2.r0;
                                        nz4VarArr[i22] = a2;
                                        p69Var2.r0 = i22 + 1;
                                        i19++;
                                        sparseArray3 = sparseArray2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                sparseArray2 = sparseArray3;
                                i19++;
                                sparseArray3 = sparseArray2;
                                arrayList3 = arrayList2;
                            }
                            sparseArray = sparseArray3;
                            arrayList = arrayList3;
                            uy4Var.d.S();
                        }
                        i18++;
                        sparseArray3 = sparseArray;
                        arrayList3 = arrayList;
                        i11 = 0;
                    }
                }
                int i23 = 2;
                for (int i24 = 0; i24 < childCount3; i24++) {
                    constraintLayout.getChildAt(i24);
                }
                SparseArray sparseArray4 = constraintLayout.n;
                sparseArray4.clear();
                sparseArray4.put(0, oz4Var);
                sparseArray4.put(constraintLayout.getId(), oz4Var);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray4.put(childAt2.getId(), constraintLayout.a(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    nz4 a3 = constraintLayout.a(childAt3);
                    if (a3 != null) {
                        xy4 xy4Var2 = (xy4) childAt3.getLayoutParams();
                        oz4Var.q0.add(a3);
                        oz4 oz4Var2 = a3.U;
                        if (oz4Var2 != null) {
                            oz4Var2.q0.remove(a3);
                            a3.C();
                        }
                        a3.U = oz4Var;
                        xy4Var2.a();
                        a3.h0 = childAt3.getVisibility();
                        a3.g0 = childAt3;
                        if (childAt3 instanceof uy4) {
                            ((uy4) childAt3).h(a3, oz4Var.v0);
                        }
                        if (xy4Var2.d0) {
                            s19 s19Var = (s19) a3;
                            int i27 = xy4Var2.m0;
                            int i28 = xy4Var2.n0;
                            float f2 = xy4Var2.o0;
                            if (f2 != -1.0f) {
                                if (f2 > -1.0f) {
                                    s19Var.q0 = f2;
                                    c = 65535;
                                    s19Var.r0 = -1;
                                    s19Var.s0 = -1;
                                    i3 = i26;
                                    z3 = z2;
                                    i5 = i23;
                                }
                            } else {
                                c = 65535;
                                if (i27 != -1) {
                                    if (i27 > -1) {
                                        s19Var.q0 = -1.0f;
                                        s19Var.r0 = i27;
                                        s19Var.s0 = -1;
                                    }
                                } else if (i28 != -1 && i28 > -1) {
                                    s19Var.q0 = -1.0f;
                                    s19Var.r0 = -1;
                                    s19Var.s0 = i28;
                                }
                                i3 = i26;
                                z3 = z2;
                                i5 = i23;
                            }
                        } else {
                            int i29 = xy4Var2.f0;
                            int i30 = xy4Var2.g0;
                            int i31 = xy4Var2.h0;
                            int i32 = xy4Var2.i0;
                            int i33 = xy4Var2.j0;
                            int i34 = xy4Var2.k0;
                            i3 = i26;
                            float f3 = xy4Var2.l0;
                            int i35 = xy4Var2.p;
                            z3 = z2;
                            if (i35 != -1) {
                                nz4 nz4Var8 = (nz4) sparseArray4.get(i35);
                                if (nz4Var8 != null) {
                                    float f4 = xy4Var2.r;
                                    int i36 = xy4Var2.q;
                                    oy4 oy4Var = oy4.CENTER;
                                    a3.v(oy4Var, nz4Var8, oy4Var, i36, 0);
                                    a3.D = f4;
                                }
                                constraintLayout = this;
                                nz4Var6 = a3;
                                xy4Var = xy4Var2;
                            } else {
                                if (i29 != -1) {
                                    nz4 nz4Var9 = (nz4) sparseArray4.get(i29);
                                    if (nz4Var9 != null) {
                                        oy4 oy4Var2 = oy4.LEFT;
                                        nz4Var = a3;
                                        nz4Var.v(oy4Var2, nz4Var9, oy4Var2, ((ViewGroup.MarginLayoutParams) xy4Var2).leftMargin, i33);
                                    } else {
                                        nz4Var = a3;
                                    }
                                } else {
                                    nz4Var = a3;
                                    if (i30 != -1 && (nz4Var2 = (nz4) sparseArray4.get(i30)) != null) {
                                        nz4Var.v(oy4.LEFT, nz4Var2, oy4.RIGHT, ((ViewGroup.MarginLayoutParams) xy4Var2).leftMargin, i33);
                                    }
                                }
                                if (i31 != -1) {
                                    nz4 nz4Var10 = (nz4) sparseArray4.get(i31);
                                    if (nz4Var10 != null) {
                                        nz4Var.v(oy4.RIGHT, nz4Var10, oy4.LEFT, ((ViewGroup.MarginLayoutParams) xy4Var2).rightMargin, i34);
                                    }
                                } else if (i32 != -1 && (nz4Var3 = (nz4) sparseArray4.get(i32)) != null) {
                                    oy4 oy4Var3 = oy4.RIGHT;
                                    nz4Var.v(oy4Var3, nz4Var3, oy4Var3, ((ViewGroup.MarginLayoutParams) xy4Var2).rightMargin, i34);
                                }
                                int i37 = xy4Var2.i;
                                if (i37 != -1) {
                                    nz4 nz4Var11 = (nz4) sparseArray4.get(i37);
                                    if (nz4Var11 != null) {
                                        oy4 oy4Var4 = oy4.TOP;
                                        nz4Var.v(oy4Var4, nz4Var11, oy4Var4, ((ViewGroup.MarginLayoutParams) xy4Var2).topMargin, xy4Var2.x);
                                    }
                                } else {
                                    int i38 = xy4Var2.j;
                                    if (i38 != -1 && (nz4Var4 = (nz4) sparseArray4.get(i38)) != null) {
                                        nz4Var.v(oy4.TOP, nz4Var4, oy4.BOTTOM, ((ViewGroup.MarginLayoutParams) xy4Var2).topMargin, xy4Var2.x);
                                    }
                                }
                                int i39 = xy4Var2.k;
                                if (i39 != -1) {
                                    nz4 nz4Var12 = (nz4) sparseArray4.get(i39);
                                    if (nz4Var12 != null) {
                                        nz4Var.v(oy4.BOTTOM, nz4Var12, oy4.TOP, ((ViewGroup.MarginLayoutParams) xy4Var2).bottomMargin, xy4Var2.z);
                                    }
                                } else {
                                    int i40 = xy4Var2.l;
                                    if (i40 != -1 && (nz4Var5 = (nz4) sparseArray4.get(i40)) != null) {
                                        oy4 oy4Var5 = oy4.BOTTOM;
                                        nz4Var.v(oy4Var5, nz4Var5, oy4Var5, ((ViewGroup.MarginLayoutParams) xy4Var2).bottomMargin, xy4Var2.z);
                                    }
                                }
                                xy4Var = xy4Var2;
                                int i41 = xy4Var.m;
                                if (i41 != -1) {
                                    constraintLayout = this;
                                    nz4Var6 = nz4Var;
                                    constraintLayout.k(nz4Var6, xy4Var, sparseArray4, i41, oy4.BASELINE);
                                } else {
                                    int i42 = xy4Var.n;
                                    if (i42 != -1) {
                                        constraintLayout = this;
                                        nz4Var6 = nz4Var;
                                        constraintLayout.k(nz4Var6, xy4Var, sparseArray4, i42, oy4.TOP);
                                    } else {
                                        int i43 = xy4Var.o;
                                        if (i43 != -1) {
                                            constraintLayout = this;
                                            nz4Var6 = nz4Var;
                                            constraintLayout.k(nz4Var6, xy4Var, sparseArray4, i43, oy4.BOTTOM);
                                        } else {
                                            constraintLayout = this;
                                            nz4Var6 = nz4Var;
                                        }
                                    }
                                }
                                if (f3 >= 0.0f) {
                                    nz4Var6.e0 = f3;
                                }
                                float f5 = xy4Var.F;
                                if (f5 >= 0.0f) {
                                    nz4Var6.f0 = f5;
                                }
                            }
                            if (isInEditMode && ((i8 = xy4Var.T) != -1 || xy4Var.U != -1)) {
                                int i44 = xy4Var.U;
                                nz4Var6.Z = i8;
                                nz4Var6.a0 = i44;
                            }
                            if (!xy4Var.a0) {
                                if (((ViewGroup.MarginLayoutParams) xy4Var).width == -1) {
                                    if (xy4Var.W) {
                                        nz4Var6.M(mz4.MATCH_CONSTRAINT);
                                    } else {
                                        nz4Var6.M(mz4.MATCH_PARENT);
                                    }
                                    nz4Var6.i(oy4.LEFT).g = ((ViewGroup.MarginLayoutParams) xy4Var).leftMargin;
                                    nz4Var6.i(oy4.RIGHT).g = ((ViewGroup.MarginLayoutParams) xy4Var).rightMargin;
                                } else {
                                    nz4Var6.M(mz4.MATCH_CONSTRAINT);
                                    nz4Var6.O(0);
                                }
                            } else {
                                nz4Var6.M(mz4.FIXED);
                                nz4Var6.O(((ViewGroup.MarginLayoutParams) xy4Var).width);
                                if (((ViewGroup.MarginLayoutParams) xy4Var).width == -2) {
                                    nz4Var6.M(mz4.WRAP_CONTENT);
                                }
                            }
                            if (!xy4Var.b0) {
                                i4 = -1;
                                if (((ViewGroup.MarginLayoutParams) xy4Var).height == -1) {
                                    if (xy4Var.X) {
                                        nz4Var6.N(mz4.MATCH_CONSTRAINT);
                                    } else {
                                        nz4Var6.N(mz4.MATCH_PARENT);
                                    }
                                    nz4Var6.i(oy4.TOP).g = ((ViewGroup.MarginLayoutParams) xy4Var).topMargin;
                                    nz4Var6.i(oy4.BOTTOM).g = ((ViewGroup.MarginLayoutParams) xy4Var).bottomMargin;
                                } else {
                                    nz4Var6.N(mz4.MATCH_CONSTRAINT);
                                    nz4Var6.L(0);
                                }
                            } else {
                                i4 = -1;
                                nz4Var6.N(mz4.FIXED);
                                nz4Var6.L(((ViewGroup.MarginLayoutParams) xy4Var).height);
                                if (((ViewGroup.MarginLayoutParams) xy4Var).height == -2) {
                                    nz4Var6.N(mz4.WRAP_CONTENT);
                                }
                            }
                            String str3 = xy4Var.G;
                            if (str3 != null && str3.length() != 0) {
                                int length = str3.length();
                                int indexOf3 = str3.indexOf(44);
                                if (indexOf3 > 0 && indexOf3 < length - 1) {
                                    String substring = str3.substring(0, indexOf3);
                                    if (substring.equalsIgnoreCase("W")) {
                                        i6 = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        i6 = i16;
                                    } else {
                                        i6 = i4;
                                    }
                                    i7 = indexOf3 + 1;
                                } else {
                                    i6 = i4;
                                    i7 = 0;
                                }
                                int indexOf4 = str3.indexOf(58);
                                if (indexOf4 >= 0 && indexOf4 < length - 1) {
                                    String substring2 = str3.substring(i7, indexOf4);
                                    String substring3 = str3.substring(indexOf4 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring2);
                                            float parseFloat3 = Float.parseFloat(substring3);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                if (i6 == i16) {
                                                    parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                                } else {
                                                    parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                                }
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring4 = str3.substring(i7);
                                    if (substring4.length() > 0) {
                                        parseFloat = Float.parseFloat(substring4);
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    nz4Var6.X = parseFloat;
                                    nz4Var6.Y = i6;
                                }
                            } else {
                                nz4Var6.X = 0.0f;
                            }
                            float f6 = xy4Var.H;
                            float[] fArr = nz4Var6.l0;
                            fArr[0] = f6;
                            i16 = 1;
                            fArr[1] = xy4Var.I;
                            nz4Var6.j0 = xy4Var.J;
                            nz4Var6.k0 = xy4Var.K;
                            int i45 = xy4Var.Z;
                            if (i45 >= 0 && i45 <= 3) {
                                nz4Var6.q = i45;
                            }
                            int i46 = xy4Var.L;
                            int i47 = xy4Var.N;
                            int i48 = xy4Var.P;
                            float f7 = xy4Var.R;
                            nz4Var6.r = i46;
                            nz4Var6.u = i47;
                            if (i48 == Integer.MAX_VALUE) {
                                i48 = 0;
                            }
                            nz4Var6.v = i48;
                            nz4Var6.w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i46 == 0) {
                                nz4Var6.r = i23;
                            }
                            int i49 = xy4Var.M;
                            int i50 = xy4Var.O;
                            int i51 = xy4Var.Q;
                            float f8 = xy4Var.S;
                            nz4Var6.s = i49;
                            nz4Var6.x = i50;
                            if (i51 == Integer.MAX_VALUE) {
                                i51 = 0;
                            }
                            nz4Var6.y = i51;
                            nz4Var6.z = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i49 == 0) {
                                i5 = 2;
                                nz4Var6.s = 2;
                            } else {
                                i5 = 2;
                            }
                        }
                        i26 = i3 + 1;
                        i23 = i5;
                        z2 = z3;
                    }
                    i3 = i26;
                    z3 = z2;
                    i5 = i23;
                    i26 = i3 + 1;
                    i23 = i5;
                    z2 = z3;
                }
            }
            if (z2) {
                oz4Var.r0.R(oz4Var);
            }
        }
        oz4Var.w0.getClass();
        constraintLayout.j(oz4Var, constraintLayout.i, i, i2);
        int q = oz4Var.q();
        int k = oz4Var.k();
        boolean z5 = oz4Var.E0;
        boolean z6 = oz4Var.F0;
        yaf yafVar = constraintLayout.o;
        int i52 = yafVar.d;
        int resolveSizeAndState = View.resolveSizeAndState(q + yafVar.c, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(k + i52, i2, 0) & 16777215;
        int min = Math.min(constraintLayout.f, resolveSizeAndState & 16777215);
        int min2 = Math.min(constraintLayout.g, resolveSizeAndState2);
        if (z5) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z6) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        constraintLayout.setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        nz4 a = a(view);
        if ((view instanceof Guideline) && !(a instanceof s19)) {
            xy4 xy4Var = (xy4) view.getLayoutParams();
            s19 s19Var = new s19();
            xy4Var.p0 = s19Var;
            xy4Var.d0 = true;
            s19Var.S(xy4Var.V);
        }
        if (view instanceof uy4) {
            uy4 uy4Var = (uy4) view;
            uy4Var.i();
            ((xy4) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(uy4Var)) {
                arrayList.add(uy4Var);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        nz4 a = a(view);
        this.c.q0.remove(a);
        a.C();
        this.b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public void setConstraintSet(hz4 hz4Var) {
        this.j = hz4Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(sz4 sz4Var) {
        ry9 ry9Var = this.k;
        if (ry9Var != null) {
            ry9Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        oz4 oz4Var = this.c;
        oz4Var.D0 = i;
        a9b.q = oz4Var.W(Barcode.FORMAT_UPC_A);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new oz4();
        this.d = 0;
        this.e = 0;
        this.f = bd0.API_PRIORITY_OTHER;
        this.g = bd0.API_PRIORITY_OTHER;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new yaf(this, this);
        e(attributeSet, i);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [xy4, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.a = -1;
        marginLayoutParams.b = -1;
        marginLayoutParams.c = -1.0f;
        marginLayoutParams.d = true;
        marginLayoutParams.e = -1;
        marginLayoutParams.f = -1;
        marginLayoutParams.g = -1;
        marginLayoutParams.h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.j = -1;
        marginLayoutParams.k = -1;
        marginLayoutParams.l = -1;
        marginLayoutParams.m = -1;
        marginLayoutParams.n = -1;
        marginLayoutParams.o = -1;
        marginLayoutParams.p = -1;
        marginLayoutParams.q = 0;
        marginLayoutParams.r = 0.0f;
        marginLayoutParams.s = -1;
        marginLayoutParams.t = -1;
        marginLayoutParams.u = -1;
        marginLayoutParams.v = -1;
        marginLayoutParams.w = Integer.MIN_VALUE;
        marginLayoutParams.x = Integer.MIN_VALUE;
        marginLayoutParams.y = Integer.MIN_VALUE;
        marginLayoutParams.z = Integer.MIN_VALUE;
        marginLayoutParams.A = Integer.MIN_VALUE;
        marginLayoutParams.B = Integer.MIN_VALUE;
        marginLayoutParams.C = Integer.MIN_VALUE;
        marginLayoutParams.D = 0;
        marginLayoutParams.E = 0.5f;
        marginLayoutParams.F = 0.5f;
        marginLayoutParams.G = null;
        marginLayoutParams.H = -1.0f;
        marginLayoutParams.I = -1.0f;
        marginLayoutParams.J = 0;
        marginLayoutParams.K = 0;
        marginLayoutParams.L = 0;
        marginLayoutParams.M = 0;
        marginLayoutParams.N = 0;
        marginLayoutParams.O = 0;
        marginLayoutParams.P = 0;
        marginLayoutParams.Q = 0;
        marginLayoutParams.R = 1.0f;
        marginLayoutParams.S = 1.0f;
        marginLayoutParams.T = -1;
        marginLayoutParams.U = -1;
        marginLayoutParams.V = -1;
        marginLayoutParams.W = false;
        marginLayoutParams.X = false;
        marginLayoutParams.Y = null;
        marginLayoutParams.Z = 0;
        marginLayoutParams.a0 = true;
        marginLayoutParams.b0 = true;
        marginLayoutParams.c0 = false;
        marginLayoutParams.d0 = false;
        marginLayoutParams.e0 = false;
        marginLayoutParams.f0 = -1;
        marginLayoutParams.g0 = -1;
        marginLayoutParams.h0 = -1;
        marginLayoutParams.i0 = -1;
        marginLayoutParams.j0 = Integer.MIN_VALUE;
        marginLayoutParams.k0 = Integer.MIN_VALUE;
        marginLayoutParams.l0 = 0.5f;
        marginLayoutParams.p0 = new nz4();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (!(layoutParams instanceof xy4)) {
            return marginLayoutParams;
        }
        xy4 xy4Var = (xy4) layoutParams;
        marginLayoutParams.a = xy4Var.a;
        marginLayoutParams.b = xy4Var.b;
        marginLayoutParams.c = xy4Var.c;
        marginLayoutParams.d = xy4Var.d;
        marginLayoutParams.e = xy4Var.e;
        marginLayoutParams.f = xy4Var.f;
        marginLayoutParams.g = xy4Var.g;
        marginLayoutParams.h = xy4Var.h;
        marginLayoutParams.i = xy4Var.i;
        marginLayoutParams.j = xy4Var.j;
        marginLayoutParams.k = xy4Var.k;
        marginLayoutParams.l = xy4Var.l;
        marginLayoutParams.m = xy4Var.m;
        marginLayoutParams.n = xy4Var.n;
        marginLayoutParams.o = xy4Var.o;
        marginLayoutParams.p = xy4Var.p;
        marginLayoutParams.q = xy4Var.q;
        marginLayoutParams.r = xy4Var.r;
        marginLayoutParams.s = xy4Var.s;
        marginLayoutParams.t = xy4Var.t;
        marginLayoutParams.u = xy4Var.u;
        marginLayoutParams.v = xy4Var.v;
        marginLayoutParams.w = xy4Var.w;
        marginLayoutParams.x = xy4Var.x;
        marginLayoutParams.y = xy4Var.y;
        marginLayoutParams.z = xy4Var.z;
        marginLayoutParams.A = xy4Var.A;
        marginLayoutParams.B = xy4Var.B;
        marginLayoutParams.C = xy4Var.C;
        marginLayoutParams.D = xy4Var.D;
        marginLayoutParams.E = xy4Var.E;
        marginLayoutParams.F = xy4Var.F;
        marginLayoutParams.G = xy4Var.G;
        marginLayoutParams.H = xy4Var.H;
        marginLayoutParams.I = xy4Var.I;
        marginLayoutParams.J = xy4Var.J;
        marginLayoutParams.K = xy4Var.K;
        marginLayoutParams.W = xy4Var.W;
        marginLayoutParams.X = xy4Var.X;
        marginLayoutParams.L = xy4Var.L;
        marginLayoutParams.M = xy4Var.M;
        marginLayoutParams.N = xy4Var.N;
        marginLayoutParams.P = xy4Var.P;
        marginLayoutParams.O = xy4Var.O;
        marginLayoutParams.Q = xy4Var.Q;
        marginLayoutParams.R = xy4Var.R;
        marginLayoutParams.S = xy4Var.S;
        marginLayoutParams.T = xy4Var.T;
        marginLayoutParams.U = xy4Var.U;
        marginLayoutParams.V = xy4Var.V;
        marginLayoutParams.a0 = xy4Var.a0;
        marginLayoutParams.b0 = xy4Var.b0;
        marginLayoutParams.c0 = xy4Var.c0;
        marginLayoutParams.d0 = xy4Var.d0;
        marginLayoutParams.f0 = xy4Var.f0;
        marginLayoutParams.g0 = xy4Var.g0;
        marginLayoutParams.h0 = xy4Var.h0;
        marginLayoutParams.i0 = xy4Var.i0;
        marginLayoutParams.j0 = xy4Var.j0;
        marginLayoutParams.k0 = xy4Var.k0;
        marginLayoutParams.l0 = xy4Var.l0;
        marginLayoutParams.Y = xy4Var.Y;
        marginLayoutParams.Z = xy4Var.Z;
        marginLayoutParams.p0 = xy4Var.p0;
        return marginLayoutParams;
    }
}
