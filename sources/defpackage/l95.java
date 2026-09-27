package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Filter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class l95 extends Filter {
    public List a;
    public final fk1 b;
    public final WeakReference c;

    public l95(List list, fk1 fk1Var, Activity activity) {
        list.getClass();
        this.a = list;
        this.b = fk1Var;
        this.c = new WeakReference(activity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r9 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r2 != null) goto L19;
     */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        List list;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (charSequence != null) {
            List list2 = this.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                String str = ((k95) obj).b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = String.valueOf(charSequence).toLowerCase(locale);
                lowerCase2.getClass();
                if (e.u(lowerCase, lowerCase2, false)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                list = arrayList;
                if (size == 1) {
                    boolean areEqual = Intrinsics.areEqual(((k95) arrayList.get(0)).b, String.valueOf(charSequence));
                    list = arrayList;
                }
            }
            list = this.a;
        }
        list = this.a;
        filterResults.values = list;
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Object obj;
        InputMethodManager inputMethodManager;
        IBinder iBinder = null;
        if (filterResults != null) {
            obj = filterResults.values;
        } else {
            obj = null;
        }
        obj.getClass();
        List list = (List) obj;
        Activity activity = (Activity) this.c.get();
        if (activity != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.areEqual(((k95) it.next()).b, charSequence)) {
                        Object systemService = activity.getSystemService("input_method");
                        if (systemService instanceof InputMethodManager) {
                            inputMethodManager = (InputMethodManager) systemService;
                        } else {
                            inputMethodManager = null;
                        }
                        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                            View currentFocus = activity.getCurrentFocus();
                            if (currentFocus != null) {
                                iBinder = currentFocus.getWindowToken();
                            }
                            inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                        }
                    }
                }
            }
        }
        fk1 fk1Var = this.b;
        fk1Var.e = list;
        fk1Var.notifyDataSetChanged();
    }
}
