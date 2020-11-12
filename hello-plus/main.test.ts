import {SimpleWebAppChart} from './main';
import {Testing} from 'cdk8s';

describe('Placeholder', () => {
  test('Empty', () => {
    const app = Testing.app();
    const chart = new SimpleWebAppChart(app, 'test-chart', {
      appImage: 'test-image',
      servicePort: 80,
      domain: 'test.local',
    });
    const results = Testing.synth(chart)
    expect(results).toMatchSnapshot();
  });
});
