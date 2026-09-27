package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        boolean z;
        int i = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d9) obj).a();
                return;
            case 1:
                hm hmVar = (hm) obj;
                if (view == hmVar.o && (message4 = hmVar.q) != null) {
                    message = Message.obtain(message4);
                } else if (view == hmVar.s && (message3 = hmVar.u) != null) {
                    message = Message.obtain(message3);
                } else if (view == hmVar.w && (message2 = hmVar.y) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                hmVar.P.obtainMessage(1, hmVar.b).sendToTarget();
                return;
            case 2:
                ji1 ji1Var = (ji1) obj;
                if (ji1Var.k && ji1Var.isShowing()) {
                    if (!ji1Var.m) {
                        TypedArray obtainStyledAttributes = ji1Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        ji1Var.l = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        ji1Var.m = true;
                    }
                    if (ji1Var.l) {
                        ji1Var.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                p4c p4cVar = (p4c) obj;
                o4c o4cVar = p4cVar.e;
                o4c o4cVar2 = o4c.YEAR;
                if (o4cVar == o4cVar2) {
                    p4cVar.o(o4c.DAY);
                } else if (o4cVar == o4c.DAY) {
                    p4cVar.o(o4cVar2);
                }
                p4cVar.p(p4cVar.getView());
                return;
            case 4:
                ((Function0) obj).invoke();
                return;
            case 5:
                ((Toolbar) obj).collapseActionView();
                return;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                int i2 = TrackSelectionView.m;
                HashMap hashMap = trackSelectionView.g;
                if (view == trackSelectionView.c) {
                    trackSelectionView.l = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.l = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.l = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    w8j w8jVar = (w8j) tag;
                    g9j g9jVar = w8jVar.a;
                    m8j m8jVar = g9jVar.b;
                    int i3 = w8jVar.b;
                    s8j s8jVar = (s8j) hashMap.get(m8jVar);
                    if (s8jVar == null) {
                        if (!trackSelectionView.i && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        hashMap.put(m8jVar, new s8j(m8jVar, jr9.s(Integer.valueOf(i3))));
                    } else {
                        ArrayList arrayList = new ArrayList(s8jVar.b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (trackSelectionView.h && g9jVar.c) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z || (trackSelectionView.i && trackSelectionView.f.size() > 1)) {
                            z2 = true;
                        }
                        if (isChecked && z2) {
                            arrayList.remove(Integer.valueOf(i3));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(m8jVar);
                            } else {
                                hashMap.put(m8jVar, new s8j(m8jVar, arrayList));
                            }
                        } else if (!isChecked) {
                            if (z) {
                                arrayList.add(Integer.valueOf(i3));
                                hashMap.put(m8jVar, new s8j(m8jVar, arrayList));
                            } else {
                                hashMap.put(m8jVar, new s8j(m8jVar, jr9.s(Integer.valueOf(i3))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
        }
    }
}
