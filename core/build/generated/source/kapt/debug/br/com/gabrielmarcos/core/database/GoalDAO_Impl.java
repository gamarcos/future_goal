package br.com.gabrielmarcos.core.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.gabrielmarcos.core.model.Goal;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GoalDAO_Impl implements GoalDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Goal> __insertionAdapterOfGoal;

  private final EntityDeletionOrUpdateAdapter<Goal> __updateAdapterOfGoal;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllGoals;

  private final SharedSQLiteStatement __preparedStmtOfDeleteGoalByID;

  public GoalDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGoal = new EntityInsertionAdapter<Goal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `future_goal` (`id`,`title`,`description`,`status`,`initAt`,`finishAt`,`remember`,`rememberAt`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Goal value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStatus());
        }
        if (value.getInitAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getInitAt());
        }
        if (value.getFinishAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFinishAt());
        }
        final Integer _tmp;
        _tmp = value.getRemember() == null ? null : (value.getRemember() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getRememberAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getRememberAt());
        }
      }
    };
    this.__updateAdapterOfGoal = new EntityDeletionOrUpdateAdapter<Goal>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `future_goal` SET `id` = ?,`title` = ?,`description` = ?,`status` = ?,`initAt` = ?,`finishAt` = ?,`remember` = ?,`rememberAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Goal value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStatus());
        }
        if (value.getInitAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getInitAt());
        }
        if (value.getFinishAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFinishAt());
        }
        final Integer _tmp;
        _tmp = value.getRemember() == null ? null : (value.getRemember() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getRememberAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getRememberAt());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllGoals = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM future_goal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteGoalByID = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM future_goal WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertGoal(final Goal goal, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGoal.insert(goal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateGoalById(final Goal goal, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfGoal.handle(goal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllGoals(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllGoals.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllGoals.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object deleteGoalByID(final String id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteGoalByID.acquire();
        int _argIndex = 1;
        if (id == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, id);
        }
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteGoalByID.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public LiveData<List<Goal>> getAllGoals() {
    final String _sql = "SELECT * FROM future_goal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"future_goal"}, false, new Callable<List<Goal>>() {
      @Override
      public List<Goal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfInitAt = CursorUtil.getColumnIndexOrThrow(_cursor, "initAt");
          final int _cursorIndexOfFinishAt = CursorUtil.getColumnIndexOrThrow(_cursor, "finishAt");
          final int _cursorIndexOfRemember = CursorUtil.getColumnIndexOrThrow(_cursor, "remember");
          final int _cursorIndexOfRememberAt = CursorUtil.getColumnIndexOrThrow(_cursor, "rememberAt");
          final List<Goal> _result = new ArrayList<Goal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Goal _item;
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpInitAt;
            _tmpInitAt = _cursor.getString(_cursorIndexOfInitAt);
            final String _tmpFinishAt;
            _tmpFinishAt = _cursor.getString(_cursorIndexOfFinishAt);
            final Boolean _tmpRemember;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfRemember)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfRemember);
            }
            _tmpRemember = _tmp == null ? null : _tmp != 0;
            final String _tmpRememberAt;
            _tmpRememberAt = _cursor.getString(_cursorIndexOfRememberAt);
            _item = new Goal(_tmpId,_tmpTitle,_tmpDescription,_tmpStatus,_tmpInitAt,_tmpFinishAt,_tmpRemember,_tmpRememberAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getGoalByID(final String id, final Continuation<? super Goal> p1) {
    final String _sql = "SELECT * FROM future_goal WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<Goal>() {
      @Override
      public Goal call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfInitAt = CursorUtil.getColumnIndexOrThrow(_cursor, "initAt");
          final int _cursorIndexOfFinishAt = CursorUtil.getColumnIndexOrThrow(_cursor, "finishAt");
          final int _cursorIndexOfRemember = CursorUtil.getColumnIndexOrThrow(_cursor, "remember");
          final int _cursorIndexOfRememberAt = CursorUtil.getColumnIndexOrThrow(_cursor, "rememberAt");
          final Goal _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            _tmpId = _cursor.getString(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final String _tmpInitAt;
            _tmpInitAt = _cursor.getString(_cursorIndexOfInitAt);
            final String _tmpFinishAt;
            _tmpFinishAt = _cursor.getString(_cursorIndexOfFinishAt);
            final Boolean _tmpRemember;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfRemember)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfRemember);
            }
            _tmpRemember = _tmp == null ? null : _tmp != 0;
            final String _tmpRememberAt;
            _tmpRememberAt = _cursor.getString(_cursorIndexOfRememberAt);
            _result = new Goal(_tmpId,_tmpTitle,_tmpDescription,_tmpStatus,_tmpInitAt,_tmpFinishAt,_tmpRemember,_tmpRememberAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
