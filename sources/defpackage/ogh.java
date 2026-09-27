package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.a0;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ogh {
    private static final /* synthetic */ ogh[] $VALUES;
    public static final mgh Companion;
    public static final ogh GONE;
    public static final ogh INVISIBLE;
    public static final ogh REMOVED;
    public static final ogh VISIBLE;

    /* JADX WARN: Type inference failed for: r0v0, types: [ogh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mgh] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ogh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ogh, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ogh, java.lang.Enum] */
    static {
        ?? r0 = new Enum("REMOVED", 0);
        REMOVED = r0;
        ?? r1 = new Enum("VISIBLE", 1);
        VISIBLE = r1;
        ?? r2 = new Enum("GONE", 2);
        GONE = r2;
        ?? r3 = new Enum("INVISIBLE", 3);
        INVISIBLE = r3;
        $VALUES = new ogh[]{r0, r1, r2, r3};
        Companion = new Object();
    }

    public static ogh valueOf(String str) {
        return (ogh) Enum.valueOf(ogh.class, str);
    }

    public static ogh[] values() {
        return (ogh[]) $VALUES.clone();
    }

    public final void a(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        a0.L(2);
        int i = ngh.a[ordinal()];
        ViewGroup viewGroup2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (a0.L(2)) {
                            Objects.toString(view);
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (a0.L(2)) {
                    Objects.toString(view);
                }
                view.setVisibility(8);
                return;
            }
            if (a0.L(2)) {
                Objects.toString(view);
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) parent;
            }
            if (viewGroup2 == null) {
                if (a0.L(2)) {
                    view.toString();
                    Objects.toString(viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent2;
        }
        if (viewGroup2 != null) {
            if (a0.L(2)) {
                view.toString();
                viewGroup2.toString();
            }
            viewGroup2.removeView(view);
        }
    }
}
