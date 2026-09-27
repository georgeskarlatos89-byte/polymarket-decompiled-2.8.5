package defpackage;

import android.util.SparseIntArray;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class u09 {
    final SparseIntArray mSpanIndexCache = new SparseIntArray();
    final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
    private boolean mCacheSpanIndices = false;
    private boolean mCacheSpanGroupIndices = false;

    public static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i) {
        int size = sparseIntArray.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (sparseIntArray.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        int i4 = i2 - 1;
        if (i4 >= 0 && i4 < sparseIntArray.size()) {
            return sparseIntArray.keyAt(i4);
        }
        return -1;
    }

    public int getCachedSpanGroupIndex(int i, int i2) {
        if (!this.mCacheSpanGroupIndices) {
            return getSpanGroupIndex(i, i2);
        }
        int i3 = this.mSpanGroupIndexCache.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int spanGroupIndex = getSpanGroupIndex(i, i2);
        this.mSpanGroupIndexCache.put(i, spanGroupIndex);
        return spanGroupIndex;
    }

    public int getCachedSpanIndex(int i, int i2) {
        if (!this.mCacheSpanIndices) {
            return getSpanIndex(i, i2);
        }
        int i3 = this.mSpanIndexCache.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int spanIndex = getSpanIndex(i, i2);
        this.mSpanIndexCache.put(i, spanIndex);
        return spanIndex;
    }

    public int getSpanGroupIndex(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int findFirstKeyLessThan;
        if (this.mCacheSpanGroupIndices && (findFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i)) != -1) {
            i4 = this.mSpanGroupIndexCache.get(findFirstKeyLessThan);
            i5 = findFirstKeyLessThan + 1;
            i3 = getSpanSize(findFirstKeyLessThan) + getCachedSpanIndex(findFirstKeyLessThan, i2);
            if (i3 == i2) {
                i4++;
                i3 = 0;
            }
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        int spanSize = getSpanSize(i);
        while (i5 < i) {
            int spanSize2 = getSpanSize(i5);
            i3 += spanSize2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = spanSize2;
            }
            i5++;
        }
        if (i3 + spanSize > i2) {
            return i4 + 1;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:10:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:10:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:10:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getSpanIndex(int i, int i2) {
        int i3;
        int i4;
        int spanSize = getSpanSize(i);
        if (spanSize == i2) {
            return 0;
        }
        if (this.mCacheSpanIndices && (i3 = findFirstKeyLessThan(this.mSpanIndexCache, i)) >= 0) {
            i4 = getSpanSize(i3) + this.mSpanIndexCache.get(i3);
            i3++;
            if (i3 >= i) {
            }
        } else {
            i3 = 0;
            i4 = 0;
            if (i3 >= i) {
                int spanSize2 = getSpanSize(i3);
                i4 += spanSize2;
                if (i4 == i2) {
                    i4 = 0;
                } else if (i4 > i2) {
                    i4 = spanSize2;
                }
                i3++;
                if (i3 >= i) {
                    if (spanSize + i4 > i2) {
                        return 0;
                    }
                    return i4;
                }
            }
        }
    }

    public abstract int getSpanSize(int i);

    public void invalidateSpanGroupIndexCache() {
        this.mSpanGroupIndexCache.clear();
    }

    public void invalidateSpanIndexCache() {
        this.mSpanIndexCache.clear();
    }

    public boolean isSpanGroupIndexCacheEnabled() {
        return this.mCacheSpanGroupIndices;
    }

    public boolean isSpanIndexCacheEnabled() {
        return this.mCacheSpanIndices;
    }

    public void setSpanGroupIndexCacheEnabled(boolean z) {
        if (!z) {
            this.mSpanGroupIndexCache.clear();
        }
        this.mCacheSpanGroupIndices = z;
    }

    public void setSpanIndexCacheEnabled(boolean z) {
        if (!z) {
            this.mSpanGroupIndexCache.clear();
        }
        this.mCacheSpanIndices = z;
    }
}
