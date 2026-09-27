package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.polymarket.android.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class axh implements a1h {
    public final int a;
    public final b1h b;
    public final int[][] c;
    public final b1h[] d;
    public final ywh e;
    public final ywh f;
    public final ywh g;
    public final ywh h;

    public axh(zwh zwhVar) {
        this.a = zwhVar.a;
        this.b = zwhVar.b;
        this.c = zwhVar.c;
        this.d = zwhVar.d;
        this.e = zwhVar.e;
        this.f = zwhVar.f;
        this.g = zwhVar.g;
        this.h = zwhVar.h;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, zwh] */
    public static axh g(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ?? obj = new Object();
        obj.c();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            obj.c();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    i(obj, context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                return obj.b();
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static void i(zwh zwhVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = jlf.B;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        b1h a = b1h.g(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i = 0;
                        for (int i2 = 0; i2 < attributeCount; i2++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i3 = i + 1;
                                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i] = attributeNameResource;
                                i = i3;
                            }
                        }
                        zwhVar.a(StateSet.trimStateSet(iArr2, i), a);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.a1h
    public final b1h a(float f) {
        return h().a(f);
    }

    @Override // defpackage.a1h
    public final b1h b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i4 < i2) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        b1h[] b1hVarArr = this.d;
        ywh ywhVar = this.h;
        ywh ywhVar2 = this.g;
        ywh ywhVar3 = this.f;
        ywh ywhVar4 = this.e;
        if (ywhVar4 == null && ywhVar3 == null && ywhVar2 == null && ywhVar == null) {
            return b1hVarArr[i4];
        }
        zsb l = b1hVarArr[i4].l();
        if (ywhVar4 != null) {
            l.e = ywhVar4.c(iArr);
        }
        if (ywhVar3 != null) {
            l.f = ywhVar3.c(iArr);
        }
        if (ywhVar2 != null) {
            l.h = ywhVar2.c(iArr);
        }
        if (ywhVar != null) {
            l.g = ywhVar.c(iArr);
        }
        return l.a();
    }

    @Override // defpackage.a1h
    public final b1h[] c() {
        return this.d;
    }

    @Override // defpackage.a1h
    public final b1h d() {
        return h();
    }

    @Override // defpackage.a1h
    public final b1h e(ixf ixfVar) {
        return h().e(ixfVar);
    }

    @Override // defpackage.a1h
    public final boolean f() {
        ywh ywhVar;
        ywh ywhVar2;
        ywh ywhVar3;
        ywh ywhVar4;
        if (this.a > 1 || (((ywhVar = this.e) != null && ywhVar.a > 1) || (((ywhVar2 = this.f) != null && ywhVar2.a > 1) || (((ywhVar3 = this.g) != null && ywhVar3.a > 1) || ((ywhVar4 = this.h) != null && ywhVar4.a > 1))))) {
            return true;
        }
        return false;
    }

    public final b1h h() {
        b1h b1hVar = this.b;
        ywh ywhVar = this.h;
        ywh ywhVar2 = this.g;
        ywh ywhVar3 = this.f;
        ywh ywhVar4 = this.e;
        if (ywhVar4 == null && ywhVar3 == null && ywhVar2 == null && ywhVar == null) {
            return b1hVar;
        }
        zsb l = b1hVar.l();
        if (ywhVar4 != null) {
            l.e = ywhVar4.b;
        }
        if (ywhVar3 != null) {
            l.f = ywhVar3.b;
        }
        if (ywhVar2 != null) {
            l.h = ywhVar2.b;
        }
        if (ywhVar != null) {
            l.g = ywhVar.b;
        }
        return l.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zwh] */
    public final zwh j() {
        ?? obj = new Object();
        int i = this.a;
        obj.a = i;
        obj.b = this.b;
        int[][] iArr = this.c;
        int[][] iArr2 = new int[iArr.length];
        obj.c = iArr2;
        b1h[] b1hVarArr = this.d;
        obj.d = new b1h[b1hVarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(b1hVarArr, 0, obj.d, 0, obj.a);
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }
}
