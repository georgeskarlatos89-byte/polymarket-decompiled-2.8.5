package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.polymarket.android.R;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class kv7 extends gcj {
    public static final String[] F = {"android:visibility:visibility", "android:visibility:parent"};
    public final int E;

    public kv7() {
        this.E = 3;
    }

    public static void O(wcj wcjVar) {
        View view = wcjVar.b;
        int visibility = view.getVisibility();
        HashMap hashMap = wcjVar.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float Q(wcj wcjVar, float f) {
        Float f2;
        if (wcjVar != null && (f2 = (Float) wcjVar.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ozf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ozf R(wcj wcjVar, wcj wcjVar2) {
        ?? obj = new Object();
        obj.a = false;
        obj.b = false;
        if (wcjVar != null) {
            HashMap hashMap = wcjVar.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (wcjVar2 != null) {
                    HashMap hashMap2 = wcjVar2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (wcjVar == null && wcjVar2 != null) {
                            int i = obj.c;
                            int i2 = obj.d;
                            if (i != i2 || ((ViewGroup) obj.e) != ((ViewGroup) obj.f)) {
                                if (i != i2) {
                                    if (i == 0) {
                                        obj.b = false;
                                        obj.a = true;
                                        return obj;
                                    }
                                    if (i2 == 0) {
                                        obj.b = true;
                                        obj.a = true;
                                        return obj;
                                    }
                                } else {
                                    if (((ViewGroup) obj.f) == null) {
                                        obj.b = false;
                                        obj.a = true;
                                        return obj;
                                    }
                                    if (((ViewGroup) obj.e) == null) {
                                        obj.b = true;
                                        obj.a = true;
                                        return obj;
                                    }
                                }
                            }
                        } else {
                            if (wcjVar != null && obj.d == 0) {
                                obj.b = true;
                                obj.a = true;
                                return obj;
                            }
                            if (wcjVar2 == null && obj.c == 0) {
                                obj.b = false;
                                obj.a = true;
                            }
                        }
                        return obj;
                    }
                }
                obj.d = -1;
                obj.f = null;
                if (wcjVar == null) {
                }
                if (wcjVar != null) {
                }
                if (wcjVar2 == null) {
                    obj.b = false;
                    obj.a = true;
                }
                return obj;
            }
        }
        obj.c = -1;
        obj.e = null;
        if (wcjVar2 != null) {
        }
        obj.d = -1;
        obj.f = null;
        if (wcjVar == null) {
        }
        if (wcjVar != null) {
        }
        if (wcjVar2 == null) {
        }
        return obj;
    }

    public final ObjectAnimator P(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        le3 le3Var = xbk.a;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, xbk.a, f2);
        jv7 jv7Var = new jv7(view);
        ofFloat.addListener(jv7Var);
        p().a(jv7Var);
        return ofFloat;
    }

    @Override // defpackage.gcj
    public final void d(wcj wcjVar) {
        O(wcjVar);
    }

    @Override // defpackage.gcj
    public final void g(wcj wcjVar) {
        O(wcjVar);
        View view = wcjVar.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (view.getVisibility() == 0) {
                le3 le3Var = xbk.a;
                f = Float.valueOf(view.getTransitionAlpha());
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        wcjVar.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (R(o(r3, false), s(r3, false)).a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bd  */
    @Override // defpackage.gcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator k(ViewGroup viewGroup, wcj wcjVar, wcj wcjVar2) {
        View view;
        boolean z;
        View view2;
        int i;
        char c;
        int i2;
        View view3;
        Animator animator;
        View view4;
        boolean z2;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        ozf R = R(wcjVar, wcjVar2);
        if (R.a && (((ViewGroup) R.e) != null || ((ViewGroup) R.f) != null)) {
            boolean z3 = R.b;
            int i4 = this.E;
            int i5 = 1;
            if (z3) {
                if ((i4 & 1) == 1 && wcjVar2 != null) {
                    View view5 = wcjVar2.b;
                    if (wcjVar == null) {
                        View view6 = (View) view5.getParent();
                    }
                    le3 le3Var = xbk.a;
                    return P(view5, Q(wcjVar, 0.0f), 1.0f);
                }
            } else {
                int i6 = R.d;
                if ((i4 & 2) == 2 && wcjVar != null) {
                    View view7 = wcjVar.b;
                    if (wcjVar2 != null) {
                        view = wcjVar2.b;
                    } else {
                        view = null;
                    }
                    View view8 = (View) view7.getTag(R.id.save_overlay_view);
                    if (view8 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view4 = null;
                        animator = null;
                    } else {
                        if (view != null && view.getParent() != null) {
                            if (i6 == 4 || view7 == view) {
                                z = false;
                                view2 = view;
                                view = null;
                                if (z) {
                                }
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view3 = view2;
                                animator = null;
                                view8 = view;
                                i5 = i2;
                                view4 = view3;
                            }
                        } else if (view != null) {
                            z = false;
                            view2 = null;
                            if (z) {
                                if (view7.getParent() == null) {
                                    i = i6;
                                    c = 1;
                                    i5 = 0;
                                    i2 = 0;
                                    view4 = view2;
                                    animator = null;
                                    view8 = view7;
                                } else if (view7.getParent() instanceof View) {
                                    View view9 = (View) view7.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (!R(s(view9, true), o(view9, true)).a) {
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                        le3 le3Var2 = xbk.a;
                                        view7.transformMatrixToGlobal(matrix);
                                        viewGroup.transformMatrixToLocal(matrix);
                                        RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                                        matrix.mapRect(rectF);
                                        int round = Math.round(rectF.left);
                                        int round2 = Math.round(rectF.top);
                                        c = 1;
                                        int round3 = Math.round(rectF.right);
                                        int round4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view7.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean isAttachedToWindow = view7.isAttachedToWindow();
                                        boolean isAttachedToWindow2 = viewGroup.isAttachedToWindow();
                                        if (!isAttachedToWindow) {
                                            if (!isAttachedToWindow2) {
                                                i = i6;
                                                view3 = view2;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view8 = imageView;
                                                i5 = i2;
                                                view4 = view3;
                                            } else {
                                                viewGroup2 = (ViewGroup) view7.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view7);
                                                k9k.a(view7, viewGroup);
                                                z2 = isAttachedToWindow;
                                                i3 = indexOfChild;
                                            }
                                        } else {
                                            z2 = isAttachedToWindow;
                                            viewGroup2 = null;
                                            i3 = 0;
                                        }
                                        view3 = view2;
                                        int round5 = Math.round(rectF.width());
                                        i = i6;
                                        int round6 = Math.round(rectF.height());
                                        if (round5 > 0 && round6 > 0) {
                                            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                            int round7 = Math.round(round5 * min);
                                            int round8 = Math.round(round6 * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            Picture picture = new Picture();
                                            Canvas beginRecording = picture.beginRecording(round7, round8);
                                            beginRecording.concat(matrix);
                                            view7.draw(beginRecording);
                                            picture.endRecording();
                                            bitmap = Bitmap.createBitmap(picture);
                                        } else {
                                            bitmap = null;
                                        }
                                        if (!z2) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i3);
                                        }
                                        if (bitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        i5 = i2;
                                        view4 = view3;
                                    } else {
                                        i = i6;
                                        c = 1;
                                        view3 = view2;
                                        int id = view9.getId();
                                        if (view9.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                        view8 = view;
                                        i5 = i2;
                                        view4 = view3;
                                    }
                                }
                            }
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view3 = view2;
                            animator = null;
                            view8 = view;
                            i5 = i2;
                            view4 = view3;
                        }
                        z = true;
                        view = null;
                        view2 = null;
                        if (z) {
                        }
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = view2;
                        animator = null;
                        view8 = view;
                        i5 = i2;
                        view4 = view3;
                    }
                    if (view8 != null) {
                        if (i5 == 0) {
                            int[] iArr = (int[]) wcjVar.a.get("android:visibility:screenLocation");
                            int i7 = iArr[i2];
                            int i8 = iArr[c];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view8.offsetLeftAndRight((i7 - iArr2[i2]) - view8.getLeft());
                            view8.offsetTopAndBottom((i8 - iArr2[c]) - view8.getTop());
                            k9k.a(view8, viewGroup);
                        }
                        le3 le3Var3 = xbk.a;
                        ObjectAnimator P = P(view8, Q(wcjVar, 1.0f), 0.0f);
                        if (P == null) {
                            view8.setTransitionAlpha(Q(wcjVar2, 1.0f));
                        }
                        if (i5 == 0) {
                            if (P == null) {
                                viewGroup.getOverlay().remove(view8);
                                return P;
                            }
                            view7.setTag(R.id.save_overlay_view, view8);
                            uck uckVar = new uck(this, viewGroup, view8, view7);
                            P.addListener(uckVar);
                            P.addPauseListener(uckVar);
                            p().a(uckVar);
                        }
                        return P;
                    }
                    if (view4 != null) {
                        int visibility = view4.getVisibility();
                        le3 le3Var4 = xbk.a;
                        view4.setTransitionVisibility(i2);
                        ObjectAnimator P2 = P(view4, Q(wcjVar, 1.0f), 0.0f);
                        if (P2 == null) {
                            view4.setTransitionAlpha(Q(wcjVar2, 1.0f));
                        }
                        if (P2 != null) {
                            tck tckVar = new tck(view4, i);
                            P2.addListener(tckVar);
                            p().a(tckVar);
                            return P2;
                        }
                        view4.setTransitionVisibility(visibility);
                        return P2;
                    }
                    return animator;
                }
            }
        }
        return null;
    }

    @Override // defpackage.gcj
    public final String[] r() {
        return F;
    }

    @Override // defpackage.gcj
    public final boolean u() {
        return true;
    }

    @Override // defpackage.gcj
    public final boolean v(wcj wcjVar, wcj wcjVar2) {
        if (wcjVar != null || wcjVar2 != null) {
            if (wcjVar == null || wcjVar2 == null || wcjVar2.a.containsKey("android:visibility:visibility") == wcjVar.a.containsKey("android:visibility:visibility")) {
                ozf R = R(wcjVar, wcjVar2);
                if (R.a) {
                    if (R.c == 0 || R.d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public kv7(int i) {
        this();
        this.E = i;
    }
}
