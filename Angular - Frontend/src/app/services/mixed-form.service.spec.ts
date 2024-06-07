import { TestBed } from '@angular/core/testing';

import { MixedFormService } from './mixed-form.service';

describe('MixedFormService', () => {
  let service: MixedFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MixedFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
