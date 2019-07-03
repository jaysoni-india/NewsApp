import { TestBed, async, inject } from '@angular/core/testing';

import { AnalystGuard } from './analyst.guard';

describe('AnalystGuard', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AnalystGuard]
    });
  });

  it('should ...', inject([AnalystGuard], (guard: AnalystGuard) => {
    expect(guard).toBeTruthy();
  }));
});
