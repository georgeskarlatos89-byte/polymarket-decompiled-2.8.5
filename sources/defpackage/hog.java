package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class hog {
    public static final eog a = new eog(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(eog eogVar) {
        int i;
        eogVar.getClass();
        if (eogVar.f == null && eogVar.g == null) {
            if (!eogVar.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
                eog eogVar2 = a;
                eog eogVar3 = (eog) atomicReference.getAndSet(eogVar2);
                if (eogVar3 == eogVar2) {
                    return;
                }
                if (eogVar3 != null) {
                    i = eogVar3.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(eogVar3);
                    return;
                }
                eogVar.f = eogVar3;
                eogVar.b = 0;
                eogVar.c = i + 8192;
                atomicReference.set(eogVar);
                return;
            }
            return;
        }
        dmk.v("Failed requirement.");
    }

    public static final eog b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        eog eogVar = a;
        eog eogVar2 = (eog) atomicReference.getAndSet(eogVar);
        if (eogVar2 == eogVar) {
            return new eog();
        }
        if (eogVar2 == null) {
            atomicReference.set(null);
            return new eog();
        }
        atomicReference.set(eogVar2.f);
        eogVar2.f = null;
        eogVar2.c = 0;
        return eogVar2;
    }
}
