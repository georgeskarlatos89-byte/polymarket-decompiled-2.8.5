package defpackage;

import androidx.recyclerview.widget.c;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class jib extends c {
    final xn0 mDiffer;
    private final vn0 mListener;

    public jib(ts6 ts6Var) {
        ExecutorService executorService;
        iib iibVar = new iib(this);
        this.mListener = iibVar;
        m4l m4lVar = new m4l(this);
        synchronized (rva.a) {
            try {
                executorService = rva.b;
                if (executorService == null) {
                    executorService = Executors.newFixedThreadPool(2);
                    rva.b = executorService;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xn0 xn0Var = new xn0(m4lVar, new r66(14, executorService, ts6Var));
        this.mDiffer = xn0Var;
        xn0Var.d.add(iibVar);
    }

    public List<Object> getCurrentList() {
        return this.mDiffer.f;
    }

    public Object getItem(int i) {
        return this.mDiffer.f.get(i);
    }

    @Override // androidx.recyclerview.widget.c
    public int getItemCount() {
        return this.mDiffer.f.size();
    }

    public void submitList(List list) {
        this.mDiffer.b(list, null);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.b(list, runnable);
    }

    public void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }
}
