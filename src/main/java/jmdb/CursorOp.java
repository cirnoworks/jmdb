package jmdb;

public enum CursorOp {
	MDB_FIRST, MDB_FIRST_DUP, MDB_GET_BOTH, MDB_GET_BOTH_RANGE, MDB_GET_CURRENT, MDB_GET_MULTIPLE, MDB_LAST, MDB_LAST_DUP, MDB_NEXT, MDB_NEXT_DUP, MDB_NEXT_MULTIPLE, MDB_NEXT_NODUP, MDB_PREV, MDB_PREV_DUP, MDB_PREV_NODUP, MDB_SET, MDB_SET_KEY, MDB_SET_RANGE;
	public int getCode() {
		return ordinal();
	}
}
